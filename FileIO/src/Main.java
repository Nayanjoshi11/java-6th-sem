import java.io.*;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        File file = new File("Nayan.txt");
        System.out.println("New file created. . .");
        try{
            file.createNewFile();
        }catch (IOException e) {
            System.out.println("File cant be created ");
            throw new RuntimeException(e);
        }

        //Write in that file
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("this is a 1st input test\n");
            fileWriter.write("this is a 2nd input test\n");
            fileWriter.write("this is a 3rd input test\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //reading from a file
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String Nayan;
            while((Nayan = bufferedReader.readLine()) != null){
                System.out.println(Nayan);
            }
        }
         catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}