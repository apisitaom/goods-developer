import React, { Component } from 'react'
import { Card, Button } from 'antd'
import HomeForm from '../../../forms/Home/HomeForm'
export default class Home extends Component {
    state = {
      key: 'tab1',
      noTitleKey: 'home',
    };
    onTabChange = (key, type) => {
      console.log(key, type);
      this.setState({ [type]: key });
    };
    render() {
        const tabListNoTitle = [
          {
            key: 'products',
            tab: 'Products',
          },
          {
            key: 'home',
            tab: `Home Page`,
          },
          {
            key: 'about',
            tab: 'About Us',
          },
          
        ];
        
        const contentListNoTitle = {
            products: <p>products content</p>,
            home: <HomeForm />,
            about: <p>about content</p>,
        };
        return (
            <div>
                <Card
                  style={{ width: '100%'}}
                  tabList={tabListNoTitle}
                  activeTabKey={this.state.noTitleKey}
                  tabBarExtraContent={<Button shape="round">SIGN IN</Button>}
                  onTabChange={key => {
                    this.onTabChange(key, 'noTitleKey');
                  }}
                >
                  {contentListNoTitle[this.state.noTitleKey]}
                </Card>
            </div>
        )
    }
}
