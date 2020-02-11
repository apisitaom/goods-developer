import React, { Component } from 'react'
import { Carousel } from 'antd'
import '../../styls/Home/HomeStype.css'
import { Image, Row, Col } from 'react-bootstrap'
export default class HomeForm extends Component {
    render() {
        return (
            <div >
                <Carousel autoplay>
                    <div>
                    <Row>
                        <Col xs={6} md={{ span: 11, offset: 2 }}>
                            <Image width="70%" src="https://user-images.githubusercontent.com/42701669/69595035-e08c7f00-1030-11ea-938d-d661f1de803e.png" alt="img1" fluid />
                        </Col>
                    </Row>
                    </div>
                    <div>
                        <Row>
                            <Col xs={6} md={{ span: 11, offset: 2 }}>
                                <Image width="70%" src="https://user-images.githubusercontent.com/42701669/70392953-af8c5100-1a17-11ea-8d98-ba12ba68bcff.PNG" alt="img1" fluid />
                            </Col>
                        </Row>
                    </div>
                    <div>
                        <Row>
                            <Col xs={6} md={{ span: 11, offset: 2 }}>
                                <Image width="70%" src="https://user-images.githubusercontent.com/42701669/69882223-1c119c80-1302-11ea-8558-98f46bba2d6d.png" alt="img1" fluid />
                            </Col>
                        </Row>
                    </div>
                    <div>
                        <Row>
                            <Col xs={6} md={{ span: 11, offset: 2 }}>
                                <Image width="70%" src="https://user-images.githubusercontent.com/42701669/69882302-554a0c80-1302-11ea-904e-2f7cfc9b9ff8.png" alt="img1" fluid />
                            </Col>
                        </Row>
                    </div>
                </Carousel>
            </div>
        )
    }
}
