/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyCat
 * version: 1.0.0
 * date: 2018/12/21
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

/**
 * @author Tyson
 * @version V1.0
 * @Description: TODO
 * @date 2018/12/21下午3:05
 */
public class MyCat {

    public MyCat() {
        System.out.println("MyCat is loaded by :" + this.getClass().getClassLoader());
        System.out.println("MySampleClass" + com.tyson.classloader.MySample.class);
    }



}
