import java.io.FileWriter;
import java.io.IOException; //To work with exception
import java.io.FileNotFoundException;

public class FileWrite {
    public static void main(String[] args){

        //FileWriter = Good for small or midium size text file
        //BufferedWriter = Better Performance for large amount of data
        //PrintWriter = Best for structured data, like reports or logs
        //FileOutputStream = best for binary files (e.g., images, audio files)


        try(FileWriter writer = new FileWriter("test.txt")){

            writer.write("Vannakam makkale");
            System.out.println("File Written Completed");
        }

        catch(IOException e){
            System.out.println("Error in Writing file");

        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }


    }
    
}
