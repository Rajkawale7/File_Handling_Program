package com.bridgelabz;
import java.io.File;                           // Importing File class
import java.io.FileNotFoundException;
import java.io.FileWriter;                 // Importing the FileWriter class to write the data into file
import java.io.IOException;             // Importing the IOException class for handling errors
import java.util.Scanner;

public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
        getFileInformation();

    }
    private static void createFile() {
        try {

            // Creating the file object of a file
            File file = new File("C:\\Users\\Raj Kawale\\OneDrive\\Desktop\\JavaProgram\\FileHandling\\Demo.txt");
            if(file.createNewFile()){
                System.out.println("File Created "+file.getName());
            }else{
                System.out.println("File exist "+file.getName());
            }

        } catch (IOException e) {
            System.out.println("An unexpected error is occurred.");
            e.printStackTrace();
        }
    }

    private static void getFileInformation() {
        //Creating an object
        File file = new File("C:\\Users\\Raj Kawale\\OneDrive\\Desktop\\JavaProgram\\FileHandling\\Demo.txt");
        if(file.exists()) {
            System.out.println("File name is: " + file.getName());
            System.out.println("Is File Readable: " + file.canRead());
            System.out.println("Is File Writable: " + file.canWrite());
            System.out.println("Is File Executable: " + file.canExecute());
            System.out.println("The Absolute path of File is: " + file.getAbsolutePath());
            System.out.println("The path of File is:  " + file.getPath());
            System.out.println("The length of file:  " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}