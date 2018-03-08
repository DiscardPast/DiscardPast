import React from 'react';
import { Layout } from 'antd';
import { List, Icon } from 'antd';
import requestURL from "reqwest";
import styles from '../../components/common/ContentLayout.css';

const {Header,Content } = Layout;

const IconText = ({ type, text }) => (
  <span>
    <Icon type={type} style={{ marginRight: 8 }} />
    {text}
  </span>
);



class ContentLayout extends React.Component{
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
  render(){
    const pagination = {
      current: 1,
      pageSize: 10,
      total: this.state.data.length,
      showQuickJumper: true,
      showSizeChanger: false
    };
    return(
      <Layout style={{ marginLeft: 200 }}>
        <Header style={{ background: '#fff', padding: 0 }} />
        <Content style={{overflow: 'auto', overflowX:'hidden',height: '90vh', position: 'fixed',top:64 ,backgroundColor:'#FFF'}}>
          <div style={{ paddingLeft: 24,paddingRight:24,paddingTop:12, background: '#fff', textAlign: 'center' }}>
            <List
              style={{width:'82vw'}}
              itemLayout="vertical"
              size="large"
              bordered='true'
              dataSource={this.state.data}
              pagination = {pagination}
              renderItem={item => (
                <List.Item
                  actions={[<IconText type="star-o" text="156" />, <IconText type="like-o" text="156" />, <IconText type="message" text="2" />]}
                  extra={<img width={272} alt="logo" src="https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png" />}
                >
                  <List.Item.Meta
                    title={<a href="https://ant.design">{item.articleTitle}</a>}
                    description={item.articleDescription}
                  />
                  <div className={styles.test}>{item.articleContent}</div>
                </List.Item>
              )}
            >
            </List>
          </div>
        </Content>
      </Layout>

    )
  }
}

export default ContentLayout;
