package org.example.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        Student student=applicationContext.getBean("st1",Student.class);
        System.out.println(student.toString());
    }
}
