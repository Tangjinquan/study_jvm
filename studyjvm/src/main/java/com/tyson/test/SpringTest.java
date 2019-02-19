/**
 * =============================================================
 * Copyright 2018 Lianjia Group All Rights Reserved
 * CompanyName: 上海链家有限公司
 * SystemName: 贝壳
 * ClassName: SpringTest
 * version: 1.0.0
 * date: 2018/11/13
 * author: Tyson
 * =============================================================
 */
package main.java.com.tyson.test;

import main.java.com.tyson.bean.Dog;
import main.java.com.tyson.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @Description: TODO
 * @author Tyson
 * @date 2018/11/13下午2:19
 * @version V1.0
 */
public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Dog bean = ApplicationContext.getBean(Dog.class);
        System.out.println(bean);

        ApplicationContext.close();
    }
}
