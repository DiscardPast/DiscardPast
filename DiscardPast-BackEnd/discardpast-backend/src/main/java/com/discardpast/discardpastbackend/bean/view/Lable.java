package com.discardpast.discardpastbackend.bean.view;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Entity
public class Lable implements Serializable {

    @Id
    @GeneratedValue
    //标签id
    private Integer lableId;

    //标签Key
    private String lableKey;

    //标签标题
    private String lableTitle;

    public Lable() {
    }

    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }

    public String getLableKey() {
        return lableKey;
    }

    public void setLableKey(String lableKey) {
        this.lableKey = lableKey;
    }

    public String getLableTitle() {
        return lableTitle;
    }

    public void setLableTitle(String lableTitle) {
        this.lableTitle = lableTitle;
    }

    @Override
    public String toString() {
        return "Lable{" +
                "lableId=" + lableId +
                ", lableKey='" + lableKey + '\'' +
                ", lableTitle='" + lableTitle + '\'' +
                '}';
    }
}
