/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest22
 * version: 1.0.0
 * date: 2018/12/27
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/12/27下午3:46
 * @version V1.0
 */
public class MyTest22 implements Runnable{

    private Thread thread;

    public MyTest22() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader contextClassLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(contextClassLoader);

        System.out.println("class" + contextClassLoader.getClass());
        System.out.println("parent" + contextClassLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest22();
    }


}
