package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO, FILE_IO}

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {

    }

    public EmployeePayrollService(List<EmployeePayrollData> emplyeePayrollList) {
        this.employeePayrollList = emplyeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("---------------welcome to EmployeePayrollService---------");
        System.out.println("_____________________________________________________________");
        Scanner scanner = new Scanner(System.in);
        ArrayList<EmployeePayrollData> employeePayrollArrayList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollArrayList);
        employeePayrollService.readEmplyoeePayrollData(scanner);
        employeePayrollService.writeEmplyoeePayrollData(IOService.CONSOLE_IO);
    }

    private void readEmplyoeePayrollData(Scanner data) {
        System.out.println("Enter your Name:");
        String name = data.nextLine();
        System.out.println("Enter your ID:");
        int id = data.nextInt();
        System.out.println("Enter your salary");
        double salary = data.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    public void writeEmplyoeePayrollData(IOService ioService) {
        if (ioService.equals(IOService.CONSOLE_IO)) {
            System.out.println("\n Writing Employee payroll roster to console" + employeePayrollList);
        } else if (ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(employeePayrollList);

        }
    }
    public long readEmployeePayrollData(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO)) {
            this.employeePayrollList = new EmployeePayrollFileIOService().readData();
            //new EmployeePayrollFileIOService().countEntries();
            return employeePayrollList.size();
        }

        return 0;
    }
    public void printData(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().printdata();
        }
    }

    public long countEntries(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO)) {
            return new EmployeePayrollFileIOService().countEntries();
            //return 0;
        }
        return 0;
    }

}

