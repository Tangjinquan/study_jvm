/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: MyTest16
 * version: 1.0.0
 * date: 2018/12/21
 * author: Tyson
 * =============================================================
 */
package com.tyson.classloader;

import java.io.*;

/**
 * @author Tyson
 * @version V1.0
 * @Description: 自定义的类加载器
 * @date 2018/12/21上午10:01
 */
public class MyTest16 extends ClassLoader {

    private String classLoaderName;

    private String path;

    private String fileExtension = ".class";

    public MyTest16(String classLoaderName) {
        super();
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "MyTest16{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] data = this.loadClassData(className);
        System.out.println("className" + className);
        System.out.println("classLoaderName" + classLoaderName);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try {
            className = className.replace(".", "/");
            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            int ch = 0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> aClass = classLoader.loadClass("com.tyson.classloader.MyTest7");
        Object o = aClass.newInstance();
        System.out.println(o.getClass().getClassLoader());
    }


    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
//        test(loader1);
//        System.out.println();
        loader1.setPath("/Users/tangjinquan/studyjvm/target/classes");

        Class<?> aClass = loader1.loadClass("com.tyson.classloader.MyTest7");
        System.out.println("aClass" + aClass.hashCode());
        Object o = aClass.newInstance();
        System.out.println(o);


//        MyTest16 loader2 = new MyTest16("loader2");
        MyTest16 loader2 = new MyTest16(loader1,"loader2");
        loader1.setPath("/Users/tangjinquan/studyjvm/target/classes");

        Class<?> aClass1 = loader1.loadClass("com.tyson.classloader.MyTest7");
        System.out.println("aClass" + aClass1.hashCode());
        Object o1 = aClass.newInstance();
        System.out.println(o1);
    }

}
