package com.discardpast.discardpastbackend.Repository;

import com.discardpast.discardpastbackend.bean.view.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Integer> {

    //通过MenuKey查询
    public List<Menu> findMenusByMenuKeyIn(List<String> menuKeyList);
}
