/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest5
 * version: 1.0.0
 * date: 2018/12/19
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.jvm;

import java.util.Random;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 当一个接口在初始化时，并不要求其父接口都完成了初始化 只有当程序首次使用特定接口的静态变量时，才会导致该接口的初始化。
 * @date 2018/12/19下午3:52
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(Mychild.b);
    }
}

interface Mygrandpa {
    //    public static int a = 5;
    public static Thread  thead = new Thread(){
        {
            System.out.println("Mygrandpa invoke");
        }
    };
}

interface Myparent5 {
//    public static int a = 5;
    public static Thread  thead = new Thread(){
        {
            System.out.println("Myparent5 invoke");
        }
    };
}

class Mychild implements Myparent5 {
    //    public static int b = 6;
    public static int b = new Random().nextInt(2);


}