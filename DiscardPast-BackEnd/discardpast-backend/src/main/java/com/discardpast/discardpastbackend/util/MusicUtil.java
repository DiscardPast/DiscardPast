package com.discardpast.discardpastbackend.util;

import com.discardpast.discardpastbackend.bean.Music;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.AbstractID3v2Frame;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MusicUtil {

    private static final int START=6;

    //获取文件夹下的音乐列表路径
    private static List<String> getMusicPathList(String floderPath) {
        File dir = new File(floderPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        List<String> musicPathList = new ArrayList<String>();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                // 判断是文件还是文件夹
                if (files[i].isDirectory()) {
                    // 获取文件绝对路径
                    getMusicPathList(files[i].getAbsolutePath());
                    // 判断文件名是否以.mp3结尾
                } else if (fileName.endsWith("mp3")) {
                    musicPathList.add(files[i].getAbsolutePath());
                } else {
                    continue;
                }
            }

        }
        return musicPathList;
    }

    //获取音乐文件列表
    private static List<File> getMusicList(List<String> musicFilePathList) {
        List<File> musicFileList = new ArrayList<File>();
        for (String musicFilePath:musicFilePathList) {
            File musicFile = new File(musicFilePath);
            musicFileList.add(musicFile);
        }
        return musicFileList;
    }

    //获取文件夹下的歌词列表路径
    private static List<String> getLyricsPathList(String floderPath) {
        File dir = new File(floderPath);
        File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
        List<String> musicPathList = new ArrayList<String>();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                // 判断是文件还是文件夹
                if (files[i].isDirectory()) {
                    // 获取文件绝对路径
                    getLyricsPathList(files[i].getAbsolutePath());
                    // 判断文件名是否以.mp3结尾
                } else if (fileName.endsWith("lrc")) {
                    musicPathList.add(files[i].getAbsolutePath());
                } else {
                    continue;
                }
            }

        }
        return musicPathList;
    }

    //获取歌词文件列表
    private static List<File> getLyricsList(List<String> lyricsFilePathList) {
        List<File> lyricsFileList = new ArrayList<File>();
        for (String lyricsFilePath:lyricsFilePathList) {
            File lyricsFile = new File(lyricsFilePath);
            lyricsFileList.add(lyricsFile);
        }
        return lyricsFileList;
    }

    //获取歌名列表
    private static List<String> getMusicSongNameList(List<String> musicListPath) throws ReadOnlyFileException, CannotReadException, TagException, InvalidAudioFrameException, IOException {
        List<String> musicSongNameList = new ArrayList<String>();
        for (String musicPath:musicListPath) {
            File music = new File(musicPath);
            MP3File mp3File = new MP3File(music);
            AbstractID3v2Tag abstractID3v2Tag = mp3File.getID3v2Tag();
            String songName = new String(abstractID3v2Tag.frameMap.get("TIT2").toString().getBytes("UTF-8"),"UTF-8");
            musicSongNameList.add(songName.substring(START,songName.length()-3));
        }
        return musicSongNameList;
    }

    //获取歌手列表
    private static List<String> getMusicSingerNameList(List<String> musicListPath) throws ReadOnlyFileException, CannotReadException, TagException, InvalidAudioFrameException, IOException {
        List<String> musicSingerNameList = new ArrayList<String>();
        for (String musicPath:musicListPath) {
            File music = new File(musicPath);
            MP3File mp3File = new MP3File(music);
            AbstractID3v2Tag abstractID3v2Tag = mp3File.getID3v2Tag();
            String singerName = new String(abstractID3v2Tag.frameMap.get("TPE1").toString().getBytes("UTF-8"),"UTF-8");
            musicSingerNameList.add(singerName.substring(START,singerName.length()-3));
        }
        return musicSingerNameList;
    }

    //获取专辑名列表
    private static List<String> getMusicAlbumNameList(List<String> musicListPath) throws ReadOnlyFileException, CannotReadException, TagException, InvalidAudioFrameException, IOException {
        List<String> musicAlbumNameList = new ArrayList<String>();
        for (String musicPath:musicListPath) {
            File music = new File(musicPath);
            MP3File mp3File = new MP3File(music);
            AbstractID3v2Tag abstractID3v2Tag = mp3File.getID3v2Tag();
            String albumName = new String(abstractID3v2Tag.frameMap.get("TALB").toString().getBytes("UTF-8"),"UTF-8");
            musicAlbumNameList.add(albumName.substring(START,albumName.length()-3));
        }
        return musicAlbumNameList;
    }

    //获取专辑封面路径列表
    private static List<String> getMusicAlbumImagePathList(List<String> musicListPath) throws ReadOnlyFileException, CannotReadException, TagException, InvalidAudioFrameException, IOException {
        List<String> musicAlbumImagePathList = new ArrayList<String>();
        for (String musicPath:musicListPath) {
            File music = new File(musicPath);
            MP3File mp3File = new MP3File(music);
            AbstractID3v2Tag abstractID3v2Tag = mp3File.getID3v2Tag();
            AbstractID3v2Frame abstractID3v2Frame = (AbstractID3v2Frame) abstractID3v2Tag.getFrame("APIC");
            FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC) abstractID3v2Frame.getBody();
            byte[] musicAlbumImageByte = frameBodyAPIC.getImageData();
            String songName = new String(abstractID3v2Tag.frameMap.get("TIT2").toString().getBytes("GBK"),"GBK");
            String musicAlbumImagePath = "D:\\DiscardPast.com\\DiscardPast-BackEnd\\Music\\AlbumImage\\"+ songName.substring(START,songName.length()-3) + ".jpg";
            File file = new File(musicAlbumImagePath);
            OutputStream output = new FileOutputStream(file);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(output);
            bufferedOutput.write(musicAlbumImageByte);
            musicAlbumImagePathList.add(musicAlbumImagePath);
        }
        return musicAlbumImagePathList;
    }

    //获取专辑封面文件列表
    private static List<File> getMusicAlbumImageList(List<String> musicAlbumImagePathList){
        List<File> musicAlbumImageList = new ArrayList<File>();
        for (String musicAlbumImagePath:musicAlbumImagePathList) {
            File musicAlbumImage = new File(musicAlbumImagePath);
            musicAlbumImageList.add(musicAlbumImage);
        }
        return musicAlbumImageList;
    }
    //获取音乐时长列表
    private static List<Integer> getMusicDurationList(List<String> musicListPath) throws ReadOnlyFileException, CannotReadException, TagException, InvalidAudioFrameException, IOException {
        List<Integer> musicDurationList = new ArrayList<Integer>();
        for (String musicPath:musicListPath) {
            File music = new File(musicPath);
            MP3File mp3File = new MP3File(music);
            MP3AudioHeader musicHeader = mp3File.getMP3AudioHeader();
            Integer musicDuration = musicHeader.getTrackLength();
            musicDurationList.add(musicDuration);
        }
        return musicDurationList;
    }

    //
    public static List<Music> getMusicList(String floderPath) throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException, IOException {
        List<Music> musicList = new ArrayList<Music>();
        List<String> musicPathList = getMusicPathList(floderPath);
        List<File> musicFileList = getMusicList(musicPathList);
        List<String> lyricsPathList = getLyricsPathList(floderPath);
        List<File> lyricsFileList = getLyricsList(lyricsPathList);
        List<String> musicSongNameList = getMusicSongNameList(musicPathList);
        List<String> musicSingerNameList = getMusicSingerNameList(musicPathList);
        List<String> musicAlbumNameList = getMusicAlbumNameList(musicPathList);
        List<String> musicAlbumImagePathList = getMusicAlbumImagePathList(musicPathList);
        List<File> musicAlbumImageFileList = getMusicAlbumImageList(musicAlbumImagePathList);
        List<Integer> musicDurationList = getMusicDurationList(musicPathList);

        for(int i = 0;i < musicPathList.size(); i++)
        {
            Music music = new Music();
            music.setMusicTitle(musicSongNameList.get(i));
            music.setMusicAuthor(musicSingerNameList.get(i));
            music.setMusicAlbumName(musicAlbumNameList.get(i));
            music.setMusicDuration(musicDurationList.get(i));
            music.setMusicFile(musicFileList.get(i));
            music.setMusicLyrics(lyricsFileList.get(i));
            music.setMusicImage(musicAlbumImageFileList.get(i));
            musicList.add(music);
        }
        return musicList;
    }
}
