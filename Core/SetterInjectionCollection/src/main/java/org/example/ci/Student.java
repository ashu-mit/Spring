package org.example.ci;

import java.util.List;

public class Student {

    private int id;

    public Student(int id, String name, String address, List<String> course, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.course = course;
        this.certificate = certificate;
    }

    private String name;
    private String address;
    private List<String> course;
    private Certificate certificate;

    public Student(String name, String address) {
        System.out.println("string ,string");
        this.name = name;
        this.address = address;
    }
    public Student(int id, String name) {
        System.out.println("int ,string");
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                ", certificate=" + certificate +
                '}';
    }
}
