package com.discardpast.discardpastbackend.bean;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Comment implements Serializable{

    //评论者id
    @Id
    @GeneratedValue
    private Integer commentId;
    //评论Key(评论属于Article/Code/Comment)
    private String commentKey;
    //评论者昵称
    private String commentName;
    //评论者头像
    private File commentImage;
    //评论者评论时间
    private Date commentDate;
    //评论者评论内容
    private String commentContent;
    //评论喜欢人数
    private Integer commentLike;
    //评论不喜欢人数
    private Integer commentDislike;

    //评论回复评论
    private Comment commentComment;

    public Comment() {
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentKey() {
        return commentKey;
    }

    public void setCommentKey(String commentKey) {
        this.commentKey = commentKey;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public File getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(File commentImage) {
        this.commentImage = commentImage;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(Integer commentLike) {
        this.commentLike = commentLike;
    }

    public Integer getCommentDislike() {
        return commentDislike;
    }

    public void setCommentDislike(Integer commentDislike) {
        this.commentDislike = commentDislike;
    }

    public Comment getCommentComment() {
        return commentComment;
    }

    public void setCommentComment(Comment commentComment) {
        this.commentComment = commentComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", commentKey='" + commentKey + '\'' +
                ", commentName='" + commentName + '\'' +
                ", commentImage=" + commentImage +
                ", commentDate=" + commentDate +
                ", commentContent='" + commentContent + '\'' +
                ", commentLike=" + commentLike +
                ", commentDislike=" + commentDislike +
                ", commentComment=" + commentComment +
                '}';
    }
}
