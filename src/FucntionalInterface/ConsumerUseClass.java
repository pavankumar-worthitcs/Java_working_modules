package FucntionalInterface;

import java.util.function.Consumer;

public class ConsumerUseClass {
    public static void main(String[] args) {


        String user  = "Rahul";

        Consumer<String> greetUser = str -> System.out.println("Hello "+str);

        greetUser.accept(user);


    }
}
