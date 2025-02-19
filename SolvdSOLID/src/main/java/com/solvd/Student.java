package com.solvd;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public void run() {
        System.out.println("Student can run");
    }

    public void jump() {
        System.out.println("Student can jump");
    }


}
