package com.diepchi;

import com.diepchi.chapter4.Accoutant;
import com.diepchi.chapter4.Employee;
import com.diepchi.chapter4.Manager;
import com.diepchi.chapter4.SinhVien;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // instance
        // SinhVien sv = new SinhVien("Dat Vu", 2001); // reference
        // // sv.showInfo();
        // SinhVien sv1 = sv;
        // sv.setYearOfBirth(2003);
        // sv.showInfo();

        Employee acc = new Accoutant("Dat", "Quan 7", 30);
        Employee mng = new Manager("Jack", "Quan 1", 30);

        acc.calSalary();
        mng.calSalary();

        // acc.testAcc();
        // mng.testAcc();

        if (acc instanceof Accoutant) {
            Accoutant tmp = (Accoutant) acc;
            tmp.testAcc();
        }

        // Manager xManager = (Manager) acc;

        System.out.println("acc: " + acc.getSalary());
        System.out.println("mng: " + mng.getSalary());
    }
}
