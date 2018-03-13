package com.cmcc;

import com.cmcc.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by cmcc on 18-3-12.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        System.out.println(demoService.sayHello("哈哈哈"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
