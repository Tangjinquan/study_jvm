/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: JvmTest
 * version: 1.0.0
 * date: 2018/11/12
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.jvm;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 对于静态字段来说，只有直接定义了该字段的类才会被初始化；当一个类在初始化时，要求其父类全部都已经初始化完毕了 -XX: +TraceClassLoading，用于追踪类的加载信息并打印出来
 * @date 2018/11/12上午10:16
 */
public class JvmTest {
    public static void main(String[] args) {

//        System.out.println(Myparent1.str);
        System.out.println(Mychild1.str2);
    }
}

class Myparent1 {
    public static String str = "hello world";

    static {
        System.out.println("Myparent1 static block");
    }
}

class Mychild1 extends Myparent1 {
    public static String str2 = "welcome";
    static {
        System.out.println("Mychild1 static block");
    }

}
