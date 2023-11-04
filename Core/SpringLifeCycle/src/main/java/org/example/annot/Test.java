package org.example.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("config1.xml");
        applicationContext.registerShutdownHook();
        Student student=applicationContext.getBean("st",Student.class);
        System.out.println(student);
    }
}
