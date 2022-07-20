package com.diepchi.chapter4;

public class SinhVien {
    // Attributes
    private String name;
    private int yearOfBirth;
    private String phone;
    private float math;
    private float physics;
    private float english;
    private float avgPoint;

    // Getter, setter

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getAvgPoint() {
        // calAvgPoint();
        return avgPoint;
    }

    // Constructor
    public SinhVien() {
    }

    public SinhVien(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public SinhVien(String name, int yearOfBirth, String phone) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
    }

    // Input, output

    // Bussinees code
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Phone: " + phone);
        System.out.println("Math: " + math);
        System.out.println("Physics: " + physics);
        System.out.println("English: " + english);
    }

    public void calAvgPoint() {
        float sumPoint = math + physics + english;
        avgPoint = sumPoint / 3;
    }

    public void go() {
        System.out.println(name + " Going ... ");
    }
}
