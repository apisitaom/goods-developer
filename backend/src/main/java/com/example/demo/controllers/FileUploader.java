package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.example.demo.entities.ImageModel;
import com.example.demo.repositories.ImageRepository;
import java.util.Date;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/files")
@Controller
public class FileUploader {
   Date date = new Date();
   
   List<String> files = new ArrayList<String>();
   private final Path rootLocation = Paths.get("D:/spring_image");

   @Autowired
   ImageRepository imageRepository;

   @PostMapping("/savefile")
   public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
      String message;      
      try {
         try {
            //Write to Directory | in local storage computer
            Files.copy(file.getInputStream(), this.rootLocation.resolve(date.getTime()+file.getOriginalFilename()));
            
            //Write to ImageModel
            ImageModel img = new ImageModel(date.getTime()+file.getOriginalFilename(), file.getContentType(),
               compressBytes(file.getBytes())); 
            imageRepository.save(img);
         } catch (Exception e) {
            throw new RuntimeException("FAIL!");
         }
         files.add(file.getOriginalFilename());

         message = "Successfully uploaded!";
         return ResponseEntity.status(HttpStatus.OK).body(message);
      } catch (Exception e) {
         message = "Failed to upload!";
         return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
      }
   }
   @GetMapping("/get/{imageName}")
	public ImageModel getImage(@PathVariable("imageName") String imageName) throws IOException {
      
		final Optional<ImageModel> retrievedImage = imageRepository.findByName(imageName);
		ImageModel img = new ImageModel(retrievedImage.get().getName(), retrievedImage.get().getType(),
		   decompressBytes(retrievedImage.get().getPicByte()));
		return img;
	}

   public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

		return outputStream.toByteArray();
   }
   	// uncompress the image bytes before returning it to the angular application
	public static byte[] decompressBytes(byte[] data) {
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		try {
			while (!inflater.finished()) {
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		} catch (IOException ioe) {
		} catch (DataFormatException e) {
		}
		return outputStream.toByteArray();
	}
}