/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest10
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
 * @date 2018/12/19下午6:17
 * @version V1.0
 */

class Parent3{
    static int a = 3;

    static {
        System.out.println("Parent3 static");
    }
    static void doSomething(){
        System.out.println("do something");
    }

}

class Child3 extends Parent3 {
    public static final int b = 4;
    static {
        System.out.println("Child3 static");
    }
}

public class MyTest10 {

    public static void main(String[] args) {
        System.out.println(Child3.a);
        System.out.println("---------");
        Child3.doSomething();
    }
}
