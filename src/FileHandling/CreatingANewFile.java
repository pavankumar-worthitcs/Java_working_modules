package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingANewFile {
    public static void main(String[] args) throws IOException {

        File newFile =  new File("Practice.txt");
        //createNewFile() it will create new file, if it not exists, otherwise it will return false
        System.out.println(newFile.createNewFile()); // true

    }
}
