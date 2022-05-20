/*package com.bridgelabz;

import com.bridgelabz.EmployeePayroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class EmployeePayrollFileIOService {
    public static String PAYROLL_FILE_NAME= "C:\\Users\\Hp\\IdeaProjects\\EmplpyeePayrollService\\src\\Payroll-file.txt";

    public void writeData(List<EmployeePayroll> employeePayrollList){
        StringBuffer empBuffer=new StringBuffer();
        employeePayrollList.forEach(employeePayroll -> {
            String employeeDataString =employeePayroll.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try{
            Files.write(paths.get(PAYROLL_FILE_NAME),empBuffer.toString().getBytes());
        }catch (IOException e){
            e.printStackTrace();

        }
        public void printData() {
            try {
                Files.lines(new File("C:\\Users\\Hp\\IdeaProjects\\EmplpyeePayrollService\\src\\Payroll-file.txt").toPath()).forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
            public long countEntries(){
                long entries=0;
                try{
                    entries=Files.lines(new File("C:\\Users\\Hp\\IdeaProjects\\EmplpyeePayrollService\\src\\Payroll-file.txt").toPath()).count();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
*/