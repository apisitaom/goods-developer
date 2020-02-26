import React, { Component } from 'react'
import { Card } from 'antd'
import { Col, Row } from 'reactstrap'
import { Image, Carousel } from 'react-bootstrap'
import iPhone_X from '../../../assets/img/iPhone_X.jpg'
import iPhone_X2 from '../../../assets/img/iPhone_X2.jpg'
const colStype = {
    paddingTop: '20px'
}
const cardStype = {
    height: '260px'
}
const listData = [];
listData.push({
    id: 1,
    name:`Coffee Cafe'`,
    url:`https://github.com/apisitaom/team01-SE2561`,
    avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
    detail:`Frontend: Angular | Backend: Spring-boot | Database: H2, H2 same to RAM when restart data will loss`,
    content:`Coffee Cafe' is product for buy, sell, manage-stock | this product with computer language has JAVA, HTML, type script, java script ...`,
    album:`https://user-images.githubusercontent.com/42701669/70392953-af8c5100-1a17-11ea-8d98-ba12ba68bcff.PNG`
})

listData.push({
  id: 2,
  name:`Coffee Cafe'`,
  url:`https://github.com/apisitaom/team01-SE2561`,
  avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
  detail:`Frontend: Angular | Backend: Spring-boot | Database: H2, H2 same to RAM when restart data will loss`,
  content:`Coffee Cafe' is product for buy, sell, manage-stock | this product with computer language has JAVA, HTML, type script, java script ...`,
  album:`https://user-images.githubusercontent.com/42701669/70392953-af8c5100-1a17-11ea-8d98-ba12ba68bcff.PNG`
})

export default class Item extends Component {
    state = {
        items: 10,
    }
    onHandle = async () => {
      console.log("CARD CLICK!");
    }
    render() {
        return (
            <div style={{ padding: '20px' }}>
                <Row>
                  {
                    listData.map(index => {
                      console.log('INDEX: ' ,index);
                      return (
                        <Col xs="6" sm="4" md="2" style={colStype}>
                          <Card 
                            key={index.id} 
                            style={cardStype} 
                            bordered={false}
                            hoverable={true}>
                            <Carousel>
                              <Carousel.Item>
                                <Image src={iPhone_X} thumbnail />
                              </Carousel.Item>
                              <Carousel.Item>
                                <Image src={iPhone_X2} thumbnail />
                              </Carousel.Item>
                            </Carousel>
                            <div><p>iPhonx 64GB</p></div>
                            <div style={{color: '#FC8202'}}><p>฿19,990</p></div>
                          </Card>
                        </Col>
                      )
                    })
                  }
                </Row>
            </div>
        )
    }
}
