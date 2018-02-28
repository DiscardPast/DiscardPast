package com.discardpast.discardpastbackend.util;

import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.bean.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static List<Menu> getMenuList() {
        List<Menu> menuList = new ArrayList<Menu>();
        for (Type type:TypeUtil.getTypeList(TypeUtil.getArticleTypeArray())) {
            Menu menu = new Menu();
            menu.setMenuKey(type.getTypeKey());
            menu.setMenuTitle(type.getTypeTitle());
            menuList.add(menu);
        }
        for(Type type:TypeUtil.getTypeList(TypeUtil.getCodeTypeArray()))
        {
            Menu menu = new Menu();
            menu.setMenuKey(type.getTypeKey());
            menu.setMenuTitle(type.getTypeTitle());
            if(type.equals(TypeUtil.getTypeList(TypeUtil.getCodeTypeArray()).get(0)))
            {
                List<Menu> menuChildrenList = new ArrayList<Menu>();
                for (Type typeChildren:TypeUtil.getTypeList(TypeUtil.getJavaBackEndTypeArray())) {
                    Menu menuChildren = new Menu();
                    menuChildren.setMenuKey(typeChildren.getTypeKey());
                    menuChildren.setMenuTitle(typeChildren.getTypeTitle());
                    menuChildrenList.add(menuChildren);
                }
                menu.setMenuChildrenList(menuChildrenList);
            }
            if(type.equals(TypeUtil.getTypeList(TypeUtil.getCodeTypeArray()).get(1)))
            {
                List<Menu> menuChildrenList = new ArrayList<Menu>();
                for (Type typeChildren:TypeUtil.getTypeList(TypeUtil.getWebFrontEndTypeArray())) {
                    Menu menuChildren = new Menu();
                    menuChildren.setMenuKey(typeChildren.getTypeKey());
                    menuChildren.setMenuTitle(typeChildren.getTypeTitle());
                    menuChildrenList.add(menuChildren);
                }
                menu.setMenuChildrenList(menuChildrenList);
            }

            if(type.equals(TypeUtil.getTypeList(TypeUtil.getCodeTypeArray()).get(2)))
            {
                List<Menu> menuChildrenList = new ArrayList<Menu>();
                for (Type typeChildren:TypeUtil.getTypeList(TypeUtil.getAlgorithmTypeArray())) {
                    Menu menuChildren = new Menu();
                    menuChildren.setMenuKey(typeChildren.getTypeKey());
                    menuChildren.setMenuTitle(typeChildren.getTypeTitle());
                    menuChildrenList.add(menuChildren);
                }
                menu.setMenuChildrenList(menuChildrenList);
            }

            if(type.equals(TypeUtil.getTypeList(TypeUtil.getCodeTypeArray()).get(3)))
            {
                List<Menu> menuChildrenList = new ArrayList<Menu>();
                for (Type typeChildren:TypeUtil.getTypeList(TypeUtil.getDataStructureTypeArray())) {
                    Menu menuChildren = new Menu();
                    menuChildren.setMenuKey(typeChildren.getTypeKey());
                    menuChildren.setMenuTitle(typeChildren.getTypeTitle());
                    menuChildrenList.add(menuChildren);
                }
                menu.setMenuChildrenList(menuChildrenList);
            }
            menuList.add(menu);
        }
        return menuList;
    }
}
