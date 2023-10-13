package org.example.ci;

public class Certificate {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Certificate(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
