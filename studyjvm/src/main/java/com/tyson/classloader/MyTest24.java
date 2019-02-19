/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest24
 * version: 1.0.0
 * date: 2018/12/28
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/12/28上午10:30
 * @version V1.0
 */
public class MyTest24 {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb", "username", "password");

    }
}
