import React, { Component } from 'react'
import { Card, Button } from 'antd'
import HomeForm from '../../../forms/Home/HomeForm'
import AboutUsForm from '../../../forms/About/AboutUsForm'
import Product from '../../../forms/Product/Product'
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
            key: 'product',
            tab: 'PRODUCT & GOODS',
          },
          {
            key: 'home',
            tab: `HOME PAGE`,
          },
          {
            key: 'about',
            tab: 'ABOUT US',
          },
          
        ];
        
        const contentListNoTitle = {
            product: <Product />,
            home: <HomeForm />,
            about: <AboutUsForm />,
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
