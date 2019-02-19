/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest6
 * version: 1.0.0
 * date: 2018/12/19
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.jvm;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 一个类的初始化是从上到下的初始化的顺序
 * @date 2018/12/19下午4:06
 */
public class MyTest6 {
    public static void main(String[] args) {
        MySingleton instance = MySingleton.getInstance();
        System.out.println("count1 ： " + MySingleton.count1);
        System.out.println("count2 ： " + MySingleton.count2);
    }

}


class MySingleton {
    public static int count1;
    //    public static int count2 = 0;
    private static MySingleton ourInstance = new MySingleton();


    private MySingleton() {
        count1++;
        count2++;  //准备阶段的意义
        System.out.println(count1);
        System.out.println(count2);
    }

    public static int count2 = 0;

    public static MySingleton getInstance() {
        return ourInstance;
    }
}
