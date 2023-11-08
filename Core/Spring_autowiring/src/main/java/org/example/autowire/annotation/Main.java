package org.example.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Student student = applicationContext.getBean("stu", Student.class);
        System.out.println(student);
    }
}