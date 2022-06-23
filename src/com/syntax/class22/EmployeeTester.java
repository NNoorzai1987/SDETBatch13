package com.syntax.class22;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.calculatePrintSalary();
        manager.calculatePrintHolidays();

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculatePrintSalary();
        officeBoy.calculatePrintHolidays();

    }
}
