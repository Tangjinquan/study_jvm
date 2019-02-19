/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: Dog
 * version: 1.0.0
 * date: 2018/11/13
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/11/13下午2:05
 * @version V1.0
 */
@Component
public class Dog {

    public Dog (){
        System.out.println("dog");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog PostConstruct");
    }


    @PreDestroy
    public void destory(){
        System.out.println("dog PreDestroy");
    }

}
