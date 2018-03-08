import React from 'react';
import { List, Layout, Avatar } from 'antd';
import requestURL from 'reqwest';

const {Sider} = Layout;

class MusicList extends React.Component{
  state = {
    bordered: "true",
    itemLayout: "horizontal",
    split: "true",
    size: "small",
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
  renderListItem(dataJson)
  {
    return(
      dataJson.map((music) => {
        return(
          <List.Item
            style = {{paddingRight:20}}
          >
            <List.Item.Meta
              avatar={<Avatar src="http://discardpast.oss-cn-hongkong.aliyuncs.com/Music/MusicImage/%E6%97%B6%E9%97%B4%E8%B5%B7%E7%82%B9%EF%BC%88%E3%80%8A%E5%8C%A0%E5%BF%83%E3%80%8B%E7%AC%AC%E4%B8%80%E6%9C%9FED%EF%BC%89%EF%BC%88Cover%20Love%20To%20Be%20Loved%20By%20You%EF%BC%89.jpg?Expires=1519895838&OSSAccessKeyId=TMP.AQEbJmNqNN_25kETje2BRYhZ4e76uvii_oRxkHJBsFVn2X5tujFKHkd88Uk5AAAwLAIUAviy1_-q0Ln_OqGQijBEfFoH3GECFGqGOqJ7GeSyhLfVtOa0kyUeVydH&Signature=gk9R7PWN8lCLt9VQRbxBkH%2FDouo%3D" />}
              title = {music.musicTitle}
              description={music.musicAuthor}
            >
            </List.Item.Meta>
          </List.Item>
        )
      })
    )
  }
  render(){
    return (
      <Sider style={{overflowX: 'hidden', height: '80vh', position: 'fixed', left: 0,top:64,backgroundColor:'#FFF' }}>
        <List
          header = {<div>歌曲列表</div>}
          bordered ={this.state.bordered}
          itemLayout = {this.state.itemLayout}
          split = {this.state.split}
          size = {this.state.size}
        >
          {this.renderListItem(this.state.data)}
        </List>
      </Sider>
    )
  }
}

export default MusicList;
