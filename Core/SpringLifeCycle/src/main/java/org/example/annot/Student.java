package org.example.annot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student   {
    private int id;
    private String name;

    @PostConstruct
    public void init()
    {
        System.out.println("init call:Initilization Started");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy call:destroy Object");
    }
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


}
