package com.discardpast.discardpastbackend.util;

import com.discardpast.discardpastbackend.bean.Article;
import com.discardpast.discardpastbackend.bean.Comment;
import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.bean.view.Lable;

import java.io.File;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class ArticleUtil {

    //文章标题
    private static String articleTitle = "示例文章标题";
    //文章作者
    private static String articleAuthor = "示例文章作者";
    //文章发表时间
    private static Date articleDate = new Date(System.currentTimeMillis());
    //文章内容
    private static String articleContent = "示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容示例文章内容";
    //文章喜欢人数
    private static Integer articleLike = 10;
    //文章不喜欢人数
    private static Integer articleDislike = 1;
    //文章用户评论
    private static List<Comment> articleCommentList;
    //文章所选图片
    private static File articleImage;
    //文章标签
    private static Lable articleLable;
    //文章类型
    private static Type articleType;
    public static List<Article> getArticleList(){
        List<Article> articleList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            Article article = new Article();
            article.setArticleTitle(articleTitle);
            article.setArticleAuthor(articleAuthor);
            article.setArticleDate(articleDate);
            article.setArticleContent(articleContent);
            article.setArticleLike(articleLike);
            article.setArticleDislike(articleDislike);
            article.setArticleCommentNumber(articleCommentList.size());
            articleList.add(article);
        }
        return articleList;
    }
}
