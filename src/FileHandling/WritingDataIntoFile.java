package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoFile {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("Practice.txt"));
        writer.write("Hello, this is written using BufferedWriter");
        writer.newLine();
        writer.write("hey, hello how are you !");
        writer.close();

    }
}
