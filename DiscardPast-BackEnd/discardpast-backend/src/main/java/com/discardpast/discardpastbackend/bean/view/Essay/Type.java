package com.discardpast.discardpastbackend.bean.view.Essay;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Type implements Serializable{

    @Id
    @GeneratedValue
    //文章类型编号
    private Integer typeId;

    //文章类型Key
    private String typeKey;

    //文章类型名称
    private String typeTitle;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getTypeTitle() {
        return typeTitle;
    }

    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", typeKey='" + typeKey + '\'' +
                ", typeTitle='" + typeTitle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(typeId, type.typeId) &&
                Objects.equals(typeKey, type.typeKey) &&
                Objects.equals(typeTitle, type.typeTitle);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeId, typeKey, typeTitle);
    }
}
