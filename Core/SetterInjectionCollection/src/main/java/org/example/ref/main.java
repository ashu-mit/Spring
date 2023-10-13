package org.example.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config1.xml");
        Student student=applicationContext.getBean(Student.class,"stu");
        System.out.println(student.getName());
        System.out.println(student.getAddress().getCity());
    }
}
