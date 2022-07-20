package com.diepchi.chapter4;

public class Manager extends Employee {

    // Constructor
    public Manager() {
    }

    public Manager(String name, String address, float hour) {
        super(name, address, hour);
    }

    // Bussiness code
    @Override
    public void calSalary() {
        salary += (salary * 0.2);
    }
}
