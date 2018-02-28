package com.discardpast.discardpastbackend.bean;

import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLInsert;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

@Entity
@Table(name = "music",uniqueConstraints = {@UniqueConstraint(columnNames = {"musicTitle","musicAuthor"})})
public class Music implements Serializable{
    //音乐Id
    @Id
    @GeneratedValue
    private Integer musicId;
    //音乐标题
    private String musicTitle;
    //音乐时长
    private Integer musicDuration;
    //音乐作者
    private String musicAuthor;
    //音乐专辑
    private String musicAlbumName;
    //音乐图片
    private File musicImage;
    //音乐歌词
    private File musicLyrics;
    //音乐
    private File musicFile;

    public Music() {
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public Integer getMusicDuration() {
        return musicDuration;
    }

    public void setMusicDuration(Integer musicDuration) {
        this.musicDuration = musicDuration;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getMusicAlbumName() {
        return musicAlbumName;
    }

    public void setMusicAlbumName(String musicAlbumName) {
        this.musicAlbumName = musicAlbumName;
    }

    public File getMusicImage() {
        return musicImage;
    }

    public void setMusicImage(File musicImage) {
        this.musicImage = musicImage;
    }

    public File getMusicLyrics() {
        return musicLyrics;
    }

    public void setMusicLyrics(File musicLyrics) {
        this.musicLyrics = musicLyrics;
    }

    public File getMusicFile() {
        return musicFile;
    }

    public void setMusicFile(File musicFile) {
        this.musicFile = musicFile;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicId=" + musicId +
                ", musicTitle='" + musicTitle + '\'' +
                ", musicDuration=" + musicDuration +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", musicAlbumName='" + musicAlbumName + '\'' +
                ", musicImage=" + musicImage +
                ", musicLyrics=" + musicLyrics +
                ", musicFile=" + musicFile +
                '}';
    }
}
