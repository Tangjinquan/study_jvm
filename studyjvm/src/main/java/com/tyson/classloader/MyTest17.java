/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest17
 * version: 1.0.0
 * date: 2018/12/21
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/12/21下午3:09
 */
public class MyTest17 {

    public static void main(String[] args) throws Exception {

        com.tyson.classloader.MyTest16 loader1 = new com.tyson.classloader.MyTest16("loader1");
        Class<?> aClass = loader1.loadClass("com.tyson.classloader.MySample");
        System.out.println("aClass" + aClass.hashCode());

        //如果注释掉该行，那么并不会实例化 MySample 对象，即 MySample 构造方法不会被调用
        //因此不会实例化 MyCat 对象，即没有对 MyCat 进行主动使用
        Object o = aClass.newInstance();


    }
}
