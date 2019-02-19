/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest4
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
 * @Description: 对于数组实例来说，其类型是由 JVM 在运行期动态生成的，表示为【Lcom. Shengsiyuan. Jvm. Classloader. MyParent4
 *
 * 这种形式。动态生成的类型，其父类型就是 0 bject。
 *
 * 对于数组来说，JavaDoc 经常将构成数组的元素为 Component，实际。上就是将数组降低一个维度后的类型。
 * @date 2018/12/19下午3:35
 */
public class MyTest4 {
    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();
        MyParent4[] myParent5 = new MyParent4[1];
        System.out.println(myParent5.getClass());

        MyParent4[][] myParent6 = new MyParent4[1][1];
        System.out.println(myParent6.getClass());

        System.out.println(myParent5.getClass().getSuperclass());
        System.out.println(myParent6.getClass().getSuperclass());

        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

        char[] chars = new char[1];
        System.out.println(chars.getClass());
        System.out.println(chars.getClass().getSuperclass());

    }
}

class MyParent4 {
    static {
        System.out.println("Myparent4 static code");
    }

}