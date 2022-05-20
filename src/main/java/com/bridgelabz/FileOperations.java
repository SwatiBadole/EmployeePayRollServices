package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    //To create File
    public static void createFile() throws IOException {
        File file = new File("SWATIFILE.txt");

        if (file.createNewFile()) {
            System.out.println("File Created:" + file.getName());
        } else {
            System.out.println("File Exist:" + file.getName());
        }
    }


   /* //To delete File
    public static void DeleteOperation() {
        File f = new File("SWATIFILE.txt");
        if (f.delete()) {
            System.out.println(f.getName() + "file deleted");
        } else {
            System.out.println("file is not exist");
        }

    }*/

    //Creating the directory
    public static void CreateDirectory() {

        File file = new File("demo.txt");
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Sorry couldn’t create specified directory");
        }

    }

    //To create Empty File

    public static void CreateEmptyFile() throws IOException {
        File file = new File("EmptyFile.txt");
        if (file.createNewFile()) {
            System.out.println("Empty File Created:- " + file.length());
        } else {
            System.out.println("Empty File not create");
        }
    }

    //To print list of files
    /*public static void lists() {
        String[] lists;
        File f1 = new File("Lists.txt");
        lists = f1.list();
        System.out.println("Lists of file:");
        for (String lst : lists) {
            System.out.println(lst);
        }
    }*/
    public static void main(String[] args) throws IOException {
        createFile();
        //DeleteOperation();
        CreateDirectory();
        CreateEmptyFile();
        //lists();
    }
}