package ie.atu.storageExercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StorageExercise {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("enter the file name : ");
            String filename = keyboard.nextLine();
            Scanner inputFile = new Scanner(new File(filename));
            String str = inputFile.nextLine();
            inputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
