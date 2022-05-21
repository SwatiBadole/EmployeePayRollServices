package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollFileIOService {
    public static String PAYROLL_FILE_NAME = "Payroll-file.txt";


    public long writeData(List<EmployeePayrollData> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employeePayroll -> {
            String employeeDataString = employeePayroll.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void printdata() {
        try {
            Files.lines(new File(PAYROLL_FILE_NAME).toPath())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long countEntries() {
        long entries = 0;
        try {
            entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return entries;
    }


    public List<EmployeePayrollData> readData(){
        List<EmployeePayrollData> employeePayrollDataList=new ArrayList<>();
        try{
            Files.lines(new File(PAYROLL_FILE_NAME).toPath()).map(line->line.trim()).forEach(line->System.out.println(line));
        }catch(IOException e) {
            e.printStackTrace();
        }
        return  employeePayrollDataList;
    }
}
