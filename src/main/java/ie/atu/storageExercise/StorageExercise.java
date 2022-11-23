package ie.atu.storageExercise;

import java.io.File;

public class StorageExercise {
    public static void main(String[] args) {
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at "+myFile.getAbsolutePath());
    }
}
