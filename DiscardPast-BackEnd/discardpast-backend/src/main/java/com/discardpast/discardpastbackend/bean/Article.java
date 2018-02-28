package com.discardpast.discardpastbackend.bean;

import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.bean.view.Lable;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class Article implements Serializable{

    //文章Id
    @Id
    @GeneratedValue
    private Integer articleId;
    //文章标题
    private String articleTitle;
    //文章作者
    private String articleAuthor;
    //文章发表时间
    private Date articleDate;
    //文章内容
    private String articleContent;
    //文章喜欢人数
    private Integer articleLike;
    //文章不喜欢人数
    private Integer articleDislike;
    @OneToMany(cascade = {CascadeType.ALL})
    //文章用户评论
    private List<Comment> articleCommentList;
    //文章用户评论数量
    private Integer articleCommentNumber;
    //文章所选图片
    private File articleImage;
    //文章标签
    private Lable articleLable;
    //文章类型
    private String articleTypeTitle;

    public Article() {
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(Integer articleLike) {
        this.articleLike = articleLike;
    }

    public Integer getArticleDislike() {
        return articleDislike;
    }

    public void setArticleDislike(Integer articleDislike) {
        this.articleDislike = articleDislike;
    }

    public File getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(File articleImage) {
        this.articleImage = articleImage;
    }

    public Lable getArticleLable() {
        return articleLable;
    }

    public void setArticleLable(Lable articleLable) {
        this.articleLable = articleLable;
    }

    public Integer getArticleCommentNumber() {
        return articleCommentNumber;
    }

    public String getArticleTypeTitle() {
        return articleTypeTitle;
    }

    public void setArticleTypeTitle(String articleTypeTitle) {
        this.articleTypeTitle = articleTypeTitle;
    }

    public List<Comment> getArticleCommentList() {
        return articleCommentList;
    }

    public void setArticleCommentList(List<Comment> articleCommentList) {
        this.articleCommentList = articleCommentList;
    }

    public void setArticleCommentNumber(Integer articleCommentNumber) {
        this.articleCommentNumber = articleCommentNumber;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleAuthor='" + articleAuthor + '\'' +
                ", articleDate=" + articleDate +
                ", articleContent='" + articleContent + '\'' +
                ", articleLike=" + articleLike +
                ", articleDislike=" + articleDislike +
                ", articleCommentList=" + articleCommentList +
                ", articleCommentNumber=" + articleCommentNumber +
                ", articleImage=" + articleImage +
                ", articleLable=" + articleLable +
                ", articleTypeTitle='" + articleTypeTitle + '\'' +
                '}';
    }
}
