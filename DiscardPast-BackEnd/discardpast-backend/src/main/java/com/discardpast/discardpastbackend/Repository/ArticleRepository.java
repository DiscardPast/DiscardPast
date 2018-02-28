package com.discardpast.discardpastbackend.Repository;

import com.discardpast.discardpastbackend.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

    //通过ArticleType查询文章列表
    public List<Article> findArticlesByArticleTypeTitle (String articleTypeTitle);
}
