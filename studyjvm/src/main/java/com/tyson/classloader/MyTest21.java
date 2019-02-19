/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest21
 * version: 1.0.0
 * date: 2018/12/27
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/12/27下午2:33
 */
public class MyTest21 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());

        System.out.println(Thread.class.getClassLoader());


    }
}
