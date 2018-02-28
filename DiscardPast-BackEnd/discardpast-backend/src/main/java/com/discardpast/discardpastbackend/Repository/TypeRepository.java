package com.discardpast.discardpastbackend.Repository;

import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type,Integer>{
}
