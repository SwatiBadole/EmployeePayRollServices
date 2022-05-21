package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.bridgelabz.EmployeePayrollService.IOService.FILE_IO;

public class EmployoeePayrollServicesTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "swati badole", 520000.0),
                new EmployeePayrollData(2, "vijay patil", 590000.0),
                new EmployeePayrollData(3, "aish badole", 570000.0),

        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        //UC4:Store Employee Payroll into a file
        employeePayrollService.writeEmplyoeePayrollData(FILE_IO);
        //UC5: to print the Employee payroll file
        employeePayrollService.printData(FILE_IO);
        //UC5:to count number of entries in the file
        long entries = employeePayrollService.countEntries(FILE_IO);
        Assertions.assertEquals(3, entries);
    }
    @Test
    public  void givenFileOnReadingFromFileShouldMatchEmployeeCount(){
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        long entries =employeePayrollService.readEmployeePayrollData(FILE_IO);
        Assertions.assertEquals(0,entries);
    }
}