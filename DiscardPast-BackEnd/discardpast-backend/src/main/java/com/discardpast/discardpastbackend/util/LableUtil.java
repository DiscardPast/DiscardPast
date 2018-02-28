package com.discardpast.discardpastbackend.util;

import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import com.discardpast.discardpastbackend.bean.view.Lable;

import java.util.ArrayList;
import java.util.List;

public class LableUtil {

    public static List<Lable> getLableList(){
        List<Lable> lableList = new ArrayList<Lable>();
        for (Type type:TypeUtil.getAllTypeList()) {
            Lable lable = new Lable();
            lable.setLableKey(type.getTypeKey());
            lable.setLableTitle(type.getTypeTitle());
            lableList.add(lable);
        }
        return lableList;
    }
}
