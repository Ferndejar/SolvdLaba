package org.example;

public class Worker {

    private String name;

    private int age;

    private int salary;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("Worker name is " + name + " and his/her age is " + age);
    }
}
