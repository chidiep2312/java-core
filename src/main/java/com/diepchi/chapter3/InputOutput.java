package com.diepchi.chapter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("C:/workspace/java/java-core/src/main/java/com/diepchi/chapter3/data.txt"));
        Scanner scan = new Scanner(System.in);
        String name = "";
        System.out.println("Nhap ten: ");
        name = scan.nextLine();
        int yearOfBirth = 0;
        System.out.println("Nhap nam sinh: ");
        yearOfBirth = scan.nextInt();
        scan.nextLine();
        String phone = "";
        System.out.println("Nhap so dien thoai: ");
        phone = scan.nextLine();
        System.out.println("Ten: " + name);
        System.out.println("Nam sinh: " + yearOfBirth);
        System.out.println("So dien thoai: " + phone);
        scan.close();
    }
}
