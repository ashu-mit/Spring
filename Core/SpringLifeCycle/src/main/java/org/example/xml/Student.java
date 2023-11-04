package org.example.xml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private int id;
    private String name;

//    public void init()
//    {
//        System.out.println("init call:Initilization Started");
//    }
//    public void destroy()
//    {
//        System.out.println("destroy call:destroy Object");
//    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy call:destroy Object");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initilization Started");
    }
}
