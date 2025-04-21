package Java_8_To_21_Features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VarDataType {
    public static void main(String[] args) throws IOException {
        //var works only in the case of local variables, and it should be initialized when it is declared.
        //the case whichever the user input data is given, it should be printed on console.
        System.out.print("Enter any to print on display : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         var userData = reader.readLine(); // var DataType which is used make data dynamical type.
        System.out.println("Your data is "+userData);
    }
}
