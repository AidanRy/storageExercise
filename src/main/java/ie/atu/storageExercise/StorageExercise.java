package ie.atu.storageExercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StorageExercise {
    public static void main(String[] args) {
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at "+myFile.getAbsolutePath());
        String content = "Details to write";
        try{
            FileWriter myWriter = new FileWriter(myFile,true);
            myWriter.write("new data being written");
            myWriter.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
