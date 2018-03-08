import React from 'react';
import { connect } from 'dva';
import HeaderMenu from '../components/common/HeaderMenu';
import SiderMenu from "../components/common/SiderMenu";
import ContentLayout from "../components/common/ContentLayout";

function CodePage() {
  return (
    <div>
      <HeaderMenu defaultSelectedKeys="code"/>
      <SiderMenu dataSource = "http://127.0.0.1:8080/menu/code"/>
      <ContentLayout dataSource = "http://127.0.0.1:8080/articleList"/>
    </div>
  );
}

CodePage.propTypes = {
};

export default connect()(CodePage);
