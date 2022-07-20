package com.diepchi.chapter4;

public class Accoutant extends Employee {

    // Constructor
    public Accoutant() {
    }

    public Accoutant(String name, String address, float hour) {
        super(name, address, hour);
    }

    // Bussiness code
    @Override
    public void calSalary() {
        salary += (salary * 0.1);
    }

    public void testAcc() {
        System.out.println("test Acc");
    }

}
