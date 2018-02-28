package com.discardpast.discardpastbackend.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.File;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Code implements Serializable{

    //代码Id
    @Id
    @GeneratedValue
    private Integer codeId;
    //代码标题
    private String codeTitle;
    //代码作者
    private String codeAuthor;
    //代码时间
    private Date codeDate;
    //代码内容
    private String codeContent;
    //代码图片
    private File codeImage;
    //源代码地址
    private String codeUrl;
    //代码喜欢人数
    private Integer codeLike;
    //代码不喜欢人数
    private Integer codeDislike;
    //代码阅读量
    private Integer codeRead;
    //代码评论
    private Comment codeComment;

    public Code() {
    }

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle;
    }

    public String getCodeAuthor() {
        return codeAuthor;
    }

    public void setCodeAuthor(String codeAuthor) {
        this.codeAuthor = codeAuthor;
    }

    public Date getCodeDate() {
        return codeDate;
    }

    public void setCodeDate(Date codeDate) {
        this.codeDate = codeDate;
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent;
    }

    public File getCodeImage() {
        return codeImage;
    }

    public void setCodeImage(File codeImage) {
        this.codeImage = codeImage;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public Integer getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(Integer codeLike) {
        this.codeLike = codeLike;
    }

    public Integer getCodeDislike() {
        return codeDislike;
    }

    public void setCodeDislike(Integer codeDislike) {
        this.codeDislike = codeDislike;
    }

    public Integer getCodeRead() {
        return codeRead;
    }

    public void setCodeRead(Integer codeRead) {
        this.codeRead = codeRead;
    }

    public Comment getCodeComment() {
        return codeComment;
    }

    public void setCodeComment(Comment codeComment) {
        this.codeComment = codeComment;
    }

    @Override
    public String toString() {
        return "Code{" +
                "codeId=" + codeId +
                ", codeTitle='" + codeTitle + '\'' +
                ", codeAuthor='" + codeAuthor + '\'' +
                ", codeDate=" + codeDate +
                ", codeContent='" + codeContent + '\'' +
                ", codeImage=" + codeImage +
                ", codeUrl='" + codeUrl + '\'' +
                ", codeLike=" + codeLike +
                ", codeDislike=" + codeDislike +
                ", codeRead=" + codeRead +
                ", codeComment=" + codeComment +
                '}';
    }
}
