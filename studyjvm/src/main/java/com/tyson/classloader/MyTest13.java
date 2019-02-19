/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest13
 * version: 1.0.0
 * date: 2018/12/20
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

import java.net.URL;
import java.util.Enumeration;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/12/20下午5:21
 */
public class MyTest13 {

    public static void main(String[] args) throws Exception {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(systemClassLoader);
        System.out.println(contextClassLoader);

        Enumeration<URL> urls = contextClassLoader.getResources("com.tyson.classloader.MyTest13.class");

        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("-------------");

        Class<MyTest13> myTest13Class = MyTest13.class;
        ClassLoader classLoader = myTest13Class.getClassLoader();
        System.out.println(classLoader);

        System.out.println("-------------");


        String[] strings = new String[1];
        System.out.println(strings.getClass().getClassLoader());


        System.out.println("-------------");


        MyTest13[] MyTest13 = new MyTest13[1];
        System.out.println(MyTest13.getClass().getClassLoader());

        System.out.println("-------------");


        int[] ints = new int[1]; //数据是原生类型的数据是没有类加载器的
        System.out.println(ints.getClass().getClassLoader());

    }
}
