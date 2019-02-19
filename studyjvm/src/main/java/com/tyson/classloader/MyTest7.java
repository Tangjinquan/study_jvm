/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest7
 * version: 1.0.0
 * date: 2018/12/19
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/12/19下午5:45
 */
public class MyTest7 {

    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("java.lang.String");
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);
        Class<?> aClass1 = Class.forName("com.tyson.classloader.C");
        System.out.println(aClass1.getClassLoader());

    }


}


class C {

}