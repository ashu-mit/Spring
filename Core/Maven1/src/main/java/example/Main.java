package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Ram obj=new Ram();//here it is tightly coupled,to resolve it spring will create this objects for as
//        obj.eat();
//        obj.sleep();
//
//        Shayam obj1=new Shayam();
//        obj1.eat();
//        obj1.sleep();
//
//        Action action=new Ram();
//        action.eat();
//        action.sleep();


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        System.out.println(applicationContext);

    Ram ram=applicationContext.getBean("ram", Ram.class);
    ram.eat();
    ram.sleep();

    }
}