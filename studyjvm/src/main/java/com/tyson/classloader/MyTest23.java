/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest23
 * version: 1.0.0
 * date: 2018/12/27
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 线程上下文类加载器一般使用模式（获取  - 使用 - 还原）
 * ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
 * try {
 * Thread.currentThread().setContextClassLoader(targetccl)
 * }finally{
 * Thread.currentThread().setContextClassLoader(contextClassLoader);
 * }
 * MyMethod 里面则调用了 Thread.CurrentThread().GetContextClassLoader (），获取当前线程的上下文类加载器做某些事情。
 * 如果一个类由类加载器 A 加载，那么这个类的依赖类也是由相同的类加载器加载的（如果该依赖类之前没有被加载过的话）
 * ContextClassLoader 的作用就是为了破坏 Java 的类加载委托机制。
 * @date 2018/12/27下午4:10
 */
public class MyTest23 {
    public static void main(String[] args) {
//        Thread.currentThread().setContextClassLoader(MyTest23.class.getClassLoader().getParent());

        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = load.iterator();

        while (iterator.hasNext()) {

            Driver driver = iterator.next();
            System.out.println("driver" + driver.getClass() + "loader : " + driver.getClass().getClassLoader());
        }
        System.out.println("当前上下文类加载器： " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader类加载器： " + ServiceLoader.class.getClassLoader());

    }
}
