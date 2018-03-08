import React from 'react';
import { Layout, Menu } from 'antd';
const { Header} = Layout;
const menuItemKey = {
  index: 'index',
  code: 'code',
  article: 'article',
  music: 'music',
  contact: 'contact'
};

class HeaderMenu extends React.Component{
  state = {
    mode: 'horizontal',
    theme: 'dark',
    defaultSelectedKeys: this.props.defaultSelectedKeys
};
  handleClick = (e) => {
    switch (e.key)
    {
      case 'index':
        window.location.href='http://192.168.43.109:8000/#/';
        break;
      case 'code':
        window.location.href='http://192.168.43.109:8000/#/code';
        break;
      case 'article':
        window.location.href='http://192.168.43.109:8000/#/article';
        break;
      case 'music':
        window.location.href='http://192.168.43.109:8000/#/music';
        break;
      case 'contact':
        window.location.href='http://192.168.43.109:8000/#/contact';
        break;
      default:
        break;
    }
  };
  render(){
    return(
      <Layout>
        <Header style={{ position: 'fixed', width: '100%' }}>
              <Menu
                onClick={this.handleClick}
                mode={this.state.mode}
                theme={this.state.theme}
                defaultSelectedKeys={this.state.defaultSelectedKeys}
                style={{ lineHeight: '64px' }}
              >
                <Menu.Item key={menuItemKey.index}>首页</Menu.Item>
                <Menu.Item key={menuItemKey.code}>编程</Menu.Item>
                <Menu.Item key={menuItemKey.article}>文章</Menu.Item>
                <Menu.Item key={menuItemKey.music}>音乐</Menu.Item>
                <Menu.Item key={menuItemKey.contact}>联系方式</Menu.Item>
              </Menu>
            </Header>
      </Layout>
    )
  }
}

export default HeaderMenu;
