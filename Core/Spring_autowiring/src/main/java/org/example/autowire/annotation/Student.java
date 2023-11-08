package org.example.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    @Autowired
    @Qualifier("add2")
    private Address address;
//    @Autowired
//    public Student(Address address) {
//        System.out.println("Constructor injection");
//        this.address = address;
//
//    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    //    @Autowired
    public void setAddress(Address address) {
        System.out.println("setter injection");
        this.address = address;
    }
}
