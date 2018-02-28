package com.discardpast.discardpastbackend.bean.view;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Entity
public class Menu implements Serializable{

    @Id
    @GeneratedValue
    //菜单Id
    private Integer menuId;

    //菜单key
    private String menuKey;

    //菜单title
    private String menuTitle;

    //菜单icon
    private String menuIcon;

    //菜单url
    private String menuURL;

    @OneToMany(cascade = {CascadeType.ALL})
    //该菜单的子菜单
    private List<Menu> menuChildrenList;

    public Menu() {
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuURL() {
        return menuURL;
    }

    public void setMenuURL(String menuURL) {
        this.menuURL = menuURL;
    }

    public List<Menu> getMenuChildrenList() {
        return menuChildrenList;
    }

    public void setMenuChildrenList(List<Menu> menuChildrenList) {
        this.menuChildrenList = menuChildrenList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuKey='" + menuKey + '\'' +
                ", menuTitle='" + menuTitle + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuURL='" + menuURL + '\'' +
                ", menuChildrenList=" + menuChildrenList +
                '}';
    }
}
