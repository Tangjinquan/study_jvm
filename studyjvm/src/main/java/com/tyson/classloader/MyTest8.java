/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest8
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
 * @date 2018/12/19下午5:56
 */
class FinalTest {
    public static final int x = 3;

    static {
        System.out.println("FinalTest static block");
    }

}

public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}
