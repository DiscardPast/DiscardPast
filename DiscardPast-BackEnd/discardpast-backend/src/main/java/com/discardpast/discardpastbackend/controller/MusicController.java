package com.discardpast.discardpastbackend.controller;

import com.discardpast.discardpastbackend.Repository.MusicRepository;
import com.discardpast.discardpastbackend.bean.Music;
import com.discardpast.discardpastbackend.util.MusicUtil;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class MusicController {

    @Autowired
    private MusicRepository musicRepository;

    @GetMapping(value = "/musics")
    public List<Music> musicList(){
        return musicRepository.findAll();
    }

    @PostMapping(value = "/musics")
    public List<Music> musicAdd() throws ReadOnlyFileException, IOException, TagException, InvalidAudioFrameException, CannotReadException {
        String musicPath = "D:\\DiscardPast.com\\DiscardPast-BackEnd\\Music";
        return musicRepository.save(MusicUtil.getMusicList(musicPath));
    }

    //通过id查询music对象
    @GetMapping(value = "/music")
    private Music getMusic(@RequestParam(value="musicId",required = false,defaultValue = "1")Integer musicId){
        return musicRepository.findOne(musicId);
    }
}
