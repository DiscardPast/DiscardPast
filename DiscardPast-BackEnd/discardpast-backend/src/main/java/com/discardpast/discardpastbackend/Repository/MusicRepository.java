package com.discardpast.discardpastbackend.Repository;

import com.discardpast.discardpastbackend.bean.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music,Integer>{
}
