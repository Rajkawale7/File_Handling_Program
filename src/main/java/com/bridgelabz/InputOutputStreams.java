package com.bridgelabz;
import java.io.File;                           // Importing File class
import java.io.FileNotFoundException;
import java.io.FileWriter;                 // Importing the FileWriter class to write the data into file
import java.io.IOException;             // Importing the IOException class for handling errors
import java.util.Scanner;

public class InputOutputStreams {
    public static void main(String[] args) {
        System.out.println("**Welcome to the File Handling Demo Program**");
        createFile();
        getFileInformation();
        writingToFile();
        readFile();
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

    private static void writingToFile() {
        try {
            //Creating file object to write the contents into file
            File file = new File("C:\\Users\\Raj Kawale\\OneDrive\\Desktop\\JavaProgram\\FileHandling\\Demo.txt");

            //Creating an object to write the contents into file
            FileWriter fileWriter = new FileWriter(file);

            //Writing the contents for file
            String contentOfFile="*** Welcome to the File Handling Program ***";

            //Inserting the contents into File
            fileWriter.write(contentOfFile);

            //Closing the stream of data or file
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            //Creating an object of the file to read data
            File file = new File("C:\\Users\\Raj Kawale\\OneDrive\\Desktop\\JavaProgram\\FileHandling\\Demo.txt");

            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String readLine = scanner.nextLine();
                System.out.println(readLine);
            }

            //Closing the stream of data or file
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}