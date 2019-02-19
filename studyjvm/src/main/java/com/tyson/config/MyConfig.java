/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: Myconfig
 * version: 1.0.0
 * date: 2018/11/13
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.config;

import main.java.com.tyson.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/11/13下午2:06
 * @version V1.0
 */
@Configuration
@ComponentScan("main.java.com.tyson.bean")
public class MyConfig {


    @Bean(initMethod = "",destroyMethod = "")
    public Cat dog(){
        return new Cat();
    }

}
