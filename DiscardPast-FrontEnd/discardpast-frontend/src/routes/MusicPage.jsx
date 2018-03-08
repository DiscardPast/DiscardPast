import React from 'react';
import { connect } from 'dva';
import HeaderMenu from '../components/common/HeaderMenu';
import ContentLayout from "../components/common/ContentLayout";
import MusicList from "../components/special/MusicList";

function MusicPage() {
  return (
    <div>
      <HeaderMenu defaultSelectedKeys='music'/>
      <MusicList dataSource="http://127.0.0.1:8080/musicList"/>
    </div>
  );
}

MusicPage.propTypes = {

};

export default connect()(MusicPage);
