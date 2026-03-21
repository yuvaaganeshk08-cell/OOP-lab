import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;

public class FileRead{
    public static void main(String[] args){

       //BufferedReader  + FileReader: Best for reading line by line
       //FileInputStream: Best for binary files
       //RandomAccessFile: Best for read/write specific portion a large file


       String file = "test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);

            }
            System.out.println("Reading Completed");
        }

        catch(FileNotFoundException e){
            System.out.println("File not found");
        }

        catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
}