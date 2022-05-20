package com.bridgelabz;
import java.io.File;                           // Importing File class
import java.io.FileNotFoundException;
import java.io.FileWriter;                 // Importing the FileWriter class to write the data into file
import java.io.IOException;             // Importing the IOException class for handling errors
import java.util.Scanner;

public class InputOutputStreams {
    public static void main(String[] args) {
        createFile();
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
}