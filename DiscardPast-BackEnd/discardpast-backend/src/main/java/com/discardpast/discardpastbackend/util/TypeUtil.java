package com.discardpast.discardpastbackend.util;

import com.discardpast.discardpastbackend.bean.view.Essay.Type;
import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.*;

public class TypeUtil {

    //文章基础类型
    private static String[] baseTypeArray = {"Article", "Code"};

    //以下两项再次添加需更新TypeUtil.getTypeList()代码
    //写作文章类型
    private static String[] articleTypeArray = {"散文", "小说", "随笔"};
    //编程文章类型
    private static String[] codeTypeArray = {"Java后端", "Web前端", "算法", "数据结构"};

    //以下四项再次添加项目即可
    //Java后端类型
    private static String[] javaBackEndTypeArray = {"Java基础", "Java集合框架", "Java多线程", "Java注解"};
    //Web前端类型
    private static String[] webFrontEndTypeArray = {"HTML", "CSS", "JavaScript", "React", "NodeJs"};
    //算法类型
    private static String[] algorithmTypeArray = {"递归"};
    //数据结构类型
    private static String[] dataStructureTypeArray = {"队列", "栈", "树", "图", "堆","有向图"};

    // 返回中文的首字母
    private static String getPinYinHeadChar(String str) {
        String convert = "";
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert += pinyinArray[0].charAt(0);
            } else {
                convert += word;
            }
        }
        return convert.toUpperCase();
    }

    public static List<String> getTypeKeyList(String[] typeTitleArray){
        List<String> typeKeyList = new ArrayList<String>();
        for (String typeTitle:typeTitleArray) {
            typeKeyList.add(getPinYinHeadChar(typeTitle));
        }
        return typeKeyList;
    }

    public static List<Type> getTypeList(String[] typeStringList) {
        List<Type> typeList = new ArrayList<Type>();
        for(String typeTitle:typeStringList){
            Type type = new Type();
            type.setTypeKey(getPinYinHeadChar(typeTitle));
            type.setTypeTitle(typeTitle);
            typeList.add(type);
        }
        return typeList;
    }

    public static List<Type> getAllTypeList() {
        List<Type> typeAllList = new ArrayList<Type>();
        typeAllList.addAll(getTypeList(baseTypeArray));
        typeAllList.addAll(getTypeList(articleTypeArray));
        typeAllList.addAll(getTypeList(codeTypeArray));
        typeAllList.addAll(getTypeList(javaBackEndTypeArray));
        typeAllList.addAll(getTypeList(webFrontEndTypeArray));
        typeAllList.addAll(getTypeList(algorithmTypeArray));
        typeAllList.addAll(getTypeList(dataStructureTypeArray));
        return typeAllList;
    }

    public static String[] getBaseTypeArray() {
        return baseTypeArray;
    }

    public static void setBaseTypeArray(String[] baseTypeArray) {
        TypeUtil.baseTypeArray = baseTypeArray;
    }

    public static String[] getArticleTypeArray() {
        return articleTypeArray;
    }

    public static void setArticleTypeArray(String[] articleTypeArray) {
        TypeUtil.articleTypeArray = articleTypeArray;
    }

    public static String[] getCodeTypeArray() {
        return codeTypeArray;
    }

    public static void setCodeTypeArray(String[] codeTypeArray) {
        TypeUtil.codeTypeArray = codeTypeArray;
    }

    public static String[] getJavaBackEndTypeArray() {
        return javaBackEndTypeArray;
    }

    public static void setJavaBackEndTypeArray(String[] javaBackEndTypeArray) {
        TypeUtil.javaBackEndTypeArray = javaBackEndTypeArray;
    }

    public static String[] getWebFrontEndTypeArray() {
        return webFrontEndTypeArray;
    }

    public static void setWebFrontEndTypeArray(String[] webFrontEndTypeArray) {
        TypeUtil.webFrontEndTypeArray = webFrontEndTypeArray;
    }

    public static String[] getAlgorithmTypeArray() {
        return algorithmTypeArray;
    }

    public static void setAlgorithmTypeArray(String[] algorithmTypeArray) {
        TypeUtil.algorithmTypeArray = algorithmTypeArray;
    }

    public static String[] getDataStructureTypeArray() {
        return dataStructureTypeArray;
    }

    public static void setDataStructureTypeArray(String[] dataStructureTypeArray) {
        TypeUtil.dataStructureTypeArray = dataStructureTypeArray;
    }
}
