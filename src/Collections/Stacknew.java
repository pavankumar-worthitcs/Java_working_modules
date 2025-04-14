package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stacknew {
    public static void main(String[] args) {
        Stack<String> persons = new Stack<>();
        persons.push("Peter");
        persons.push("John");
        persons.push("Salt");

        System.out.println("top element of stack : "+persons.peek());
        System.out.println("Removed Top Element : "+persons.pop());
       Iterator<String> type =persons.iterator();

       //Iterator
       while(type.hasNext()){
           System.out.println(type.next());
       }
    }
}
