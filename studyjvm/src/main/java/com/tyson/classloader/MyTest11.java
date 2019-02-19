/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest11
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
 * @date 2018/12/19下午6:23
 * @version V1.0
 */
class Parent4{
    public  String name  = "Parent4";
    public Parent4(){
        a();
    }
     void a(){
        System.out.println(name);
    }

}

class Child4 extends Parent4 {
    public  String name  = "Child4";
    static {
        System.out.println("Child4 static");
    }
    public Child4(){
        a();
    }
    @Override
    void a(){
        System.out.println(name);
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        Parent4 parent4 = new Child4();
    }
}
