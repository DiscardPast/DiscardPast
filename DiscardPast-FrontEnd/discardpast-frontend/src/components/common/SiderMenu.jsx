import React from 'react';
import {Menu,Layout} from 'antd';
import requestURL from 'reqwest';

const {Sider} = Layout;
const { SubMenu } = Menu;

class SiderMenu extends React.Component{
  state = {
    data: []
  };
  componentDidMount() {
    this.getData((res) => {
      this.setState({
        loading: false,
        data: res,
      });
    });
  }
  getData = (callback) => {
    requestURL({
      url: this.props.dataSource,
      type: 'json',
      method: 'get',
      contentType: 'application/json',
      success: (res) => {
        callback(res);
      },
    });
  };

  renderMenuItem(dataJson)
  {
    return(
      dataJson.map((menu) => {
        if(menu.menuChildrenList.length !== 0)
        {
          return(
            <SubMenu key={menu.menuKey} title={menu.menuTitle}>
              {this.renderMenuItem(menu.menuChildrenList)}
            </SubMenu>
          )
        } else {
          return (<Menu.Item key={menu.menuKey}>{menu.menuTitle}</Menu.Item>)
        }
      })
    )
  }
  render(){
    return (
      <Sider style={{overflowX: 'hidden', height: '90vh', position: 'fixed', left: 0,top:64,backgroundColor:'#FFF' }}>
      <Menu
        mode = "inline"
        theme = "light"
        style={{ width: 190 }}
      >
        {this.renderMenuItem(this.state.data)}
      </Menu>
      </Sider>
    )
  }

}

export default SiderMenu;
