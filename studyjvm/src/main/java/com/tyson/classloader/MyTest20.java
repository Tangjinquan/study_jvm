/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest20
 * version: 1.0.0
 * date: 2018/12/26
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

import sun.misc.Launcher;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/12/26下午5:20
 */
public class MyTest20 {

    static {
        System.out.println("MyTest20 init");
    }

    public static void main(String[] args) {
        System.out.println(MyTest20.class.getClassLoader());

        System.out.println(MyTest7.class.getClassLoader());

        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        System.out.println(ClassLoader.class.getClassLoader());
        System.out.println(Launcher.class.getClassLoader());


        System.out.println(System.getProperty("java.system.class.loader"));
        System.out.println(ClassLoader.getSystemClassLoader());


    }
}
