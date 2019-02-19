/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest12
 * version: 1.0.0
 * date: 2018/12/19
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/12/19下午6:38
 * @version V1.0
 */
class CL{
    static {
        System.out.println("class CL");
    }

}

public class MyTest12 {
    public static void main(String[] args) throws Exception {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = systemClassLoader.loadClass("com.tyson.classloader.CL");
        System.out.println(aClass);
        System.out.println(aClass.getClassLoader());
        System.out.println("-------------------");
        Class<?> aClass1 = Class.forName("com.tyson.classloader.CL");
        System.out.println(aClass1);


    }
}
