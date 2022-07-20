package com.diepchi.chapter4;

public abstract class Employee {
    // Attributes
    protected String name;
    protected String address;
    protected double salary;
    protected double hour;
    protected double rate = 2000;

    // Getter, setter
    public double getSalary() {
        return salary;
    }

    // Constructors
    public Employee() {
    }

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Employee(String name, String address, double hour) {
        this(name, address);
        this.hour = hour;
    }

    // Bussiness code

    public abstract void calSalary(); // implement

}
