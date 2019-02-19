/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest18
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
 * @date 2018/12/21下午3:27
 */
public class MyTest18 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        Class<?> aClass = loader1.loadClass("com.tyson.classloader.MySample");
        System.out.println("aClass" + aClass.hashCode());

        Object o = aClass.newInstance();
    }
}
