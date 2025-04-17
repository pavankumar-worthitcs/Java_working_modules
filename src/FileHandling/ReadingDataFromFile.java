package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {
    public static void main(String[] args) throws IOException {

        //creating object for bufferedReader and reading all the data present in file.
        BufferedReader reader = new BufferedReader(new FileReader("Practice.txt"));
        //Fetching a data present in line by using readLine()
        System.out.println( reader.readLine()); //-> readLine() return a data in form of String


        //If we want to fetch multiple lines from the file, we should iterate the process
        String line ; // taking a string to store the data
        while((line = reader.readLine()) != null){ // storing in line field and checking whether it is null or not
            System.out.println(line);
        }


    }
}
