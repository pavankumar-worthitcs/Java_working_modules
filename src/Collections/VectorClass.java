package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass{

    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.addElement("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);
        System.out.println("First: " + fruits.firstElement());
        System.out.println("Last: " + fruits.lastElement());

        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        //Enumeration --> it is only applicable for legacy classes
        Enumeration<String> elements = fruits.elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }

}
