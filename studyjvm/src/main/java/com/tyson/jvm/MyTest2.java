/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest2
 * version: 1.0.0
 * date: 2018/12/13
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.jvm;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 常量在编译阶段会存入到调用这个常量的方法所在的类的常量池中，
 * 本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量的类的初始化
// 注意：这里指的是将常量存放到了 MyTest2 的常量池中，之后 MyTest2 与 MyParent2 就没有任何关系了
    甚至，我们可以将 MyParent2 的 class 文件删除
 * @date 2018/12/13下午5:29
 *
 *
 * 助记符：
 * ldc 表示将 int, float 或是 String 类型的常量值从常量池中推送至栈顶
 * Bipush 表示将单字节（-128 - 127) 的常量值推送至栈顶
 * sipush 表示将一个短整型常量池（-32768 ~32767）推送至栈顶
 * iconst_1 表示将 int 类型1推送至栈顶（iconst_m1 ~ iconst_5)
 */
public class MyTest2 {
    public static void main(String[] args) {
//        System.out.println(MyParent2.str);
//        System.out.println(MyParent2.s);
        System.out.println(MyParent2.n);
    }
}

class MyParent2 {
    public static final String str = "hello world";
    public static final short s = 128;
    public static final int m = 5;
    public static final int n = -1;


    static {
        System.out.println("Myparent2 static block");
    }

}