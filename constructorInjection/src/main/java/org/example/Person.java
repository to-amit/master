package org.example;

public class Person {
    private String name;
    private int id;
    Certi certi;

    public Person(String name, int id, Certi certi) {
        this.name = name;
        this.id = id;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", certi=" + certi.name +
                '}';
    }
}
