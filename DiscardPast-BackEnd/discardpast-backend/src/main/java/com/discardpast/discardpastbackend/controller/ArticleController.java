package com.discardpast.discardpastbackend.controller;

import com.discardpast.discardpastbackend.Repository.ArticleRepository;
import com.discardpast.discardpastbackend.bean.Article;
import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.util.ArticleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping(value = "/articleList")
    private List<Article> getArticle()
    {
        return articleRepository.findAll();
    }

    //通过ArticleType查询文章列表
    @GetMapping(value = "/article")
    private List<Article> getArticlesByArticleType(@RequestParam(value="articleTypeTitle") String articleTypeTitle){
        return articleRepository.findArticlesByArticleTypeTitle(articleTypeTitle);
    }

    @PostMapping(value = "/articleList")
    private List<Article> articleAdd()
    {
        return articleRepository.save(ArticleUtil.getArticleList());
    }
}
