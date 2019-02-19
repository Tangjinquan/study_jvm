/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest4
 * version: 1.0.0
 * date: 2019/1/16
 * author: Tyson
 * =============================================================
 */
package com.tyson.bytecode;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 栈帧 （stack frame）
 * 栈帧（stack frame)
 * 栈帧是一种用于帮助虚拟机执行方法调用与方法执行的数据结构。
 * 栈帧本身是一种数据结构，封装了方法的局部变量表、动态链接信息、方法的返回地址以及操作数栈等信息。
 * 符号引用 直接引用
 * 有些符号引用是在类加载阶段或是第一-次使用时就会转换为直接引用，这种转换叫做静态解析；另外-些符号引用则是在每次运行期转换为直接引用，这种转换叫做动态链接，这体现为 Java 的多态性。|
 * @date 2019/1/16下午2:56
 */
public class MyTest4 {


    public static void test() {
        System.out.println("ddddd");
    }

    public static void main(String[] args) {
        test();
    }

}
