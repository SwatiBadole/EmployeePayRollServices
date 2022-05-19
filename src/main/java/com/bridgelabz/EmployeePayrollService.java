package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private List<EmployeePayroll> employeePayrollList;
    public EmployeePayrollService(){

    }
    private void writeData(Scanner data){
        System.out.println("Enter your Name:");
        String name=data.nextLine();
        System.out.println("Enter your ID:");
        int id=data.nextInt();
        System.out.println("Enter your salary");
        double salary=data.nextDouble();
        EmployeePayroll empData=new EmployeePayroll(id,name,salary);
        employeePayrollList.add(empData);
    }
    public void showData(){
        System.out.println("Employee Data"+employeePayrollList);
    }

    public EmployeePayrollService(List<EmployeePayroll> emplyeePayrollList) {
        this. employeePayrollList = emplyeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("---------------welcome to EmployeePayrollService---------");
        Scanner scanner=new Scanner(System.in);
        ArrayList<EmployeePayroll> employeePayrollArrayList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollArrayList);
        employeePayrollService.writeData(scanner);
        employeePayrollService.showData();

    }
}
