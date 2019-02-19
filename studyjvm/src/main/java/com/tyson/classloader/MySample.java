/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MySample
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
 * @date 2018/12/21下午3:07
 */
public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by :" + this.getClass().getClassLoader());
        new MyCat();
        System.out.println("MyCatclass" + MyCat.class);
    }
}
