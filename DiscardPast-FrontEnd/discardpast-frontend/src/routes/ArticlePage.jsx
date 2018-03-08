import React from 'react';
import { connect } from 'dva';
import HeaderMenu from '../components/common/HeaderMenu';
import SiderMenu from "../components/common/SiderMenu";
import ContentLayout from "../components/common/ContentLayout";

function ArticlePage() {
  return (
    <div>
      <HeaderMenu defaultSelectedKeys="article"/>
      <SiderMenu dataSource = "http://127.0.0.1:8080/menu/article"/>
      <ContentLayout dataSource = "http://127.0.0.1:8080/articleList"/>
    </div>
  );
}

ArticlePage.propTypes = {
};

export default connect()(ArticlePage);
