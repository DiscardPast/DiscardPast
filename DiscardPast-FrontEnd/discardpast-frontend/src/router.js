import React from 'react';
import { Router, Route, Switch } from 'dva/router';
import IndexPage from './routes/IndexPage';
import CodePage from './routes/CodePage';
import ArticlePage from './routes/ArticlePage';
import MusicPage from './routes/MusicPage';
import ContactPage from './routes/ContactPage';

function RouterConfig({ history }) {
  return (
    <Router history={history}>
      <Switch>
        <Route path="/" exact component={IndexPage} />
        <Route path="/code" exact component={CodePage} />
        <Route path="/article" exact component={ArticlePage} />
        <Route path="/music" exact component={MusicPage} />
        <Route path="/contact" exact component={ContactPage} />
      </Switch>
    </Router>
  );
}

export default RouterConfig;
