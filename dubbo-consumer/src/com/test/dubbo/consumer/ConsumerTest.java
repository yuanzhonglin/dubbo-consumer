package com.test.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dubbo.service.IDemoService;

public class ConsumerTest {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:dubbo-consumer.xml");
        context.start();
        IDemoService demoService = (IDemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println(hello);
    }
}
