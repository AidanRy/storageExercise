package ie.atu.storageExercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;


public class StorageExercise {
    public static void main(String[] args) {
        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at "+myFile.getAbsolutePath());
        String content = "Details to write";
        try{
            PrintWriter outputFile = new PrintWriter("MyFile1.txt");
            outputFile.println("chris");
            outputFile.println("Katheryrn");
            outputFile.println("Jean");
            outputFile.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}