import React, { Component } from 'react'
import { Card, Input, Tag, Button, Icon } from 'antd'
import { Image } from 'react-bootstrap'
import { Row, Col } from 'reactstrap'
import goodshop_x2 from '../../../public/img/goodshop-X2.jpg'
const { Search } = Input;
export default class Home extends Component {
  render() {
    const iconStype = {
      fontSize: '200%', 
      paddingLeft: '1%'
    }
    return (
      <div>
          <Card style={{ width: '100%' }}>
            <Row>
              <Col md="3" xs="12" sm="6">
                <Image width="200px" height="80px" src={goodshop_x2} rounded />
              </Col>
              <Col md="6">
                <Search placeholder="ค้นหาสิ่งที่ต้องการ" onSearch={value => console.log(value)} enterButton />
                    <div style={{paddingTop: '12px'}}>
                    <Tag>พยุง</Tag>
                    <Tag>ยางนา</Tag>
                    <Tag>ของใช้ในบ้าน</Tag>
                    <Tag>สักทอง</Tag>
                    <Tag>ไม้ผล</Tag>
                    <Tag>พืชเก็บเกี่ยว</Tag>
                    <Tag>อื่น ๆ</Tag>
                  </div>
              </Col>
              <Col md="1">
                <Icon style={iconStype} type="bell" theme="filled" />
                <Icon style={iconStype} type="wechat" theme="filled" />
              </Col>
              <Col md="2">
                <Button size="small" shape="round">สมัคร|ใช้งาน</Button>  
                <Button size="small" shape="round">ขาย</Button>  
              </Col>
            </Row>
          </Card>
      </div>
    )
  }
}
