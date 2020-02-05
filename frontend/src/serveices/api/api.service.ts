import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  public api = '//localhost:9000';

  constructor(private https: HttpClient) { }
  
  ngOnInit () {
    const headers = { 'Authorization': 'Bearer my-token', 'My-Custom-Header': 'foobar' }
    const body = { title: 'Angular POST Request Example' }
    this.https.post<any>('https://jsonplaceholder.typicode.com/posts', body, { headers }).subscribe(data => {
    console.log(data);
    })
  }

  configObsercable (): Observable<any> {
    return this.https.get(this.api);
  }
  

// import { Component, OnInit } from '@angular/core';
// import { HttpClient } from '@angular/common/http';

// @Component({ selector: 'app', templateUrl: 'app.component.html' })
// export class AppComponent implements OnInit {
//     postId;

//     constructor(private http: HttpClient) { }

//     ngOnInit() {      
//         // Simple POST request with a JSON body and response type <any>
//         this.http.post<any>('https://jsonplaceholder.typicode.com/posts', { title: 'Angular POST Request Example' }).subscribe(data => {
//             this.postId = data.id;
//         })
//     }
// }

}
