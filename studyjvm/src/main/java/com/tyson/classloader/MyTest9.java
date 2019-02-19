/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest9
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
 * @date 2018/12/19下午6:04
 */
public class MyTest9 {

    static {
        System.out.println("MyTest9 static  block");
    }

    public static void main(String[] args) {
        System.out.println(Child.b);
    }

}

class Parent {
    static int a = 3;

    static {

        System.out.println("Parent static  block");
    }
}

class Child extends Parent {
    static int b = 4;

    static {

        System.out.println("Child static  block");
    }
}