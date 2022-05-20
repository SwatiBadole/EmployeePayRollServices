package com.bridgelabz;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public enum IOService {CONSOLE_IO, FILE_IO}

    private List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService() {

    }

    private void readEmplyoeePayrollData(Scanner data) {
        System.out.println("Enter your Name:");
        String name = data.nextLine();
        System.out.println("Enter your ID:");
        int id = data.nextInt();
        System.out.println("Enter your salary");
        double salary = data.nextDouble();

        EmployeePayroll empData = new EmployeePayroll(id, name, salary);
        employeePayrollList.add(empData);
    }

    //public long readEmployeePayrollDAta(IOService ioService) {

    //}

    public void WriteEmplyoeePayrollData() {
        System.out.println("Employee Data" + employeePayrollList);
    }

    public EmployeePayrollService(List<EmployeePayroll> emplyeePayrollList) {
        this.employeePayrollList = emplyeePayrollList;
    }

   /* public long readEmployeePayrollDAta(IOService ioService) {

        return ;
    }

    public void printData(IOService ioService) {
    }

    public long countEntries(IOService ioService) {

    }
*/
    public static void main(String[] args) {
        System.out.println("---------------welcome to EmployeePayrollService---------");
        System.out.println("_____________________________________________________________");
        Scanner scanner=new Scanner(System.in);
        ArrayList<EmployeePayroll> employeePayrollArrayList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollArrayList);
        employeePayrollService.readEmplyoeePayrollData(scanner);
        employeePayrollService.WriteEmplyoeePayrollData();


    }
}
