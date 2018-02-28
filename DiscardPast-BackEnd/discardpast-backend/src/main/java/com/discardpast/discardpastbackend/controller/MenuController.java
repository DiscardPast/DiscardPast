package com.discardpast.discardpastbackend.controller;

import com.discardpast.discardpastbackend.Repository.MenuRepository;
import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.bean.view.Menu;
import com.discardpast.discardpastbackend.util.MenuUtil;
import com.discardpast.discardpastbackend.util.TypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.AccessControlContext;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping(value = "/menu/article")
    public List<Menu> menuArticle(){
        List<String> articleKeyList = new ArrayList<String>();
        for(String typeKey:TypeUtil.getTypeKeyList(TypeUtil.getArticleTypeArray()))
        {
            articleKeyList.add(typeKey);
        }
        return menuRepository.findMenusByMenuKeyIn(articleKeyList);
    }

    @GetMapping(value = "/menu/code")
    public List<Menu> menuCode(){
        List<String> codeKeyList = new ArrayList<String>();
        for(String typeKey:TypeUtil.getTypeKeyList(TypeUtil.getCodeTypeArray()))
        {
            codeKeyList.add(typeKey);
        }
        return menuRepository.findMenusByMenuKeyIn(codeKeyList);
    }

    @PostMapping(value = "/menu")
    public List<Menu> menuArticleAdd() {
        return menuRepository.save(MenuUtil.getMenuList());
    }

}
