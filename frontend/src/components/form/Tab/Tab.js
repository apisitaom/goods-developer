import React, { Component } from 'react'
import { Image } from 'react-bootstrap'
import { Row, Col } from 'reactstrap'
import { Card, Input, Tag, Button, Icon, Badge, Divider, Popover } from 'antd'
import goodshop_x2 from '../../../public/img/goodshop-X2.jpg'
const { Search } = Input;
export default class Tab extends Component {
    state = {
        heart: 2,
        notification: 1,
      }
      onHandleClickHeart = async () => {
        console.log('Heart Click!');
      }
      onHandleClickBell = async () => {
        console.log('Bell Click!');
      }
      onHandleClickHelp = async () => {
        console.log('Help Click!');
      }
      render() {
        const iconStype = {
          fontSize: '200%', 
          paddingLeft: '2%'
        }
        const popoverHeartNotification = (
          <div>
            <p>ของที่ถูกใจ</p>
          </div>
        );
        const popoverBellNotification = (
          <div>
            <p>การแจ้งเตือน</p>
          </div>
        );
        const popoverHelpNotification = (
          <div>
            <p>ช่วยเหลือ</p>
          </div>
        );
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
                    <Badge count={this.state.heart}>
                        <Popover content={popoverHeartNotification}>
                        <Icon onClick={this.onHandleClickHeart} style={iconStype} type="heart" theme="filled" />                    
                        </Popover>
                    </Badge>
                    <Badge count={this.state.notification}>
                    <Popover content={popoverBellNotification}>
                      <Icon onClick={this.onHandleClickBell} style={iconStype} type="bell" theme="filled" />
                    </Popover>
                    </Badge>
                    <Popover content={popoverHelpNotification}>
                      <Icon onClick={this.onHandleClickHelp} style={iconStype} type="wechat" theme="filled" />
                    </Popover>
                  </Col>
                  <Col md="2">
                    <Button size="small" shape="round">สมัคร | ใช้งาน</Button>  
                    <Divider type="vertical" />
                    <Button size="small" shape="round">ขาย</Button>  
                  </Col>
                </Row>
              </Card>
          </div>
        )
      }
    }