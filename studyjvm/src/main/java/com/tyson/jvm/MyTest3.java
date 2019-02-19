/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest3
 * version: 1.0.0
 * date: 2018/12/19
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.jvm;

import java.util.UUID;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 当一个常量的值并非编译期间可以确定的，那么其值就不会被放到调用类的常量池中，这时在程序运行时，会导致主动使用这个常量所在的类，显然会导致这个类被初始化。
 * @date 2018/12/19下午3:27
 */
public class MyTest3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);

    }
}

class MyParent3 {
    public static final String str = UUID.randomUUID().toString();


    static {
        System.out.println("Myparent3 static code");
    }

}
