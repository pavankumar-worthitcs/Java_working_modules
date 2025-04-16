package FucntionalInterface;

import java.util.function.Function;

public class FunctionUseClass {
    public static void main(String[] args) {

        //there is user, we should generate a key based on their name !

        String userName = "Pavan kumar";

        //Generating key by using hashcode method, passing by reference
        Function<String,Integer> generateKey = (String::hashCode);

        //after generating storing in same type
        Integer userGeneratedKey =generateKey.apply(userName);

        //displaying the generated key for User

        System.out.println("your generated key is : "+Math.abs(userGeneratedKey));


      //  System.out.println(userName.chars().sum()); we can use other ways for generating key

    }
}
