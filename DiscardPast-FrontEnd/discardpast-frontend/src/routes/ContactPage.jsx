import React from 'react';
import { connect } from 'dva';
import SiderMenu from "../components/common/SiderMenu";
import HeaderMenu from "../components/common/HeaderMenu";

function ContactPage() {
  return (
    <div>
      <HeaderMenu  defaultSelectedKeys="contact"/>
      <SiderMenu dataSource = "http://127.0.0.1:8080/menu/code"/>
    </div>
  );
}

ContactPage.propTypes = {
};

export default connect()(ContactPage);
