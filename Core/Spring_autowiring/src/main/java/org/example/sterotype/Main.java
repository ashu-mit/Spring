package org.example.sterotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config2.xml");
        Emp emp=applicationContext.getBean("employee", Emp.class);
        System.out.println(emp);

    }

}
