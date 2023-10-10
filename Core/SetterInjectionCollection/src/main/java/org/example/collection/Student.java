package org.example.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private List<String> address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phno=" + phno +
                ", courses=" + courses +
                '}';
    }

    private Set<String> phno;

    public Set<String> getPhno() {
        return phno;
    }

    public void setPhno(Set<String> phno) {
        this.phno = phno;
    }

    private Map<String,String> courses;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }





    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }


}
