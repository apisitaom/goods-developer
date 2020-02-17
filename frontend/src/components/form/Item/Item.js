import React, { Component } from 'react'
import { Card } from 'antd'
import { Col, Row } from 'reactstrap'
const colStype = {
    paddingTop: '20px'
}
const cardStype = {
    height: '250px'
}
export default class Item extends Component {
    state = {
        items: 10
    }
    render() {
        return (
            <div style={{ background: '#ECECEC', padding: '20px' }}>
                <Row>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                  <Col xs="6" sm="6" md="2" style={colStype}>
                    <Card style={cardStype} bordered={false} hoverable={true}>
                      Card content
                    </Card>
                  </Col>
                </Row>
            </div>
        )
    }
}
