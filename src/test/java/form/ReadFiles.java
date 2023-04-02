package form;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {
    @Test
    public void readFile(){
        String path = "./data/users.csv";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader  = new BufferedReader(fileReader);
            String currentLine;
            while((currentLine = bufferedReader.readLine()) !=null){
                System.out.println(currentLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
