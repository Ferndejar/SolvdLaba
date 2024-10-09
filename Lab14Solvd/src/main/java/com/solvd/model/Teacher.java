package com.solvd.model;

public class Teacher {

    private String FirstName;
    private String LastName;

    private int Salary;

    private  int CarID;

    private  int Contact_InfoID;

    public Teacher() {};

    public Teacher(String firstName, String lastName, int salary, int carID, int contact_InfoID) {
        FirstName = firstName;
        LastName = lastName;
        Salary = salary;
        CarID = carID;
        Contact_InfoID = contact_InfoID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getCarID() {
        return CarID;
    }

    public void setCarID(int carID) {
        CarID = carID;
    }

    public int getContact_InfoID() {
        return Contact_InfoID;
    }

    public void setContact_InfoID(int contact_InfoID) {
        Contact_InfoID = contact_InfoID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Salary=" + Salary +
                ", CarID=" + CarID +
                ", Contact_InfoID=" + Contact_InfoID +
                '}';
    }
}
