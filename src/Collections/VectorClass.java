package Collections;

import java.util.Vector;

public class VectorClass{

    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.addElement("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);
        System.out.println("First: " + fruits.firstElement());
        System.out.println("Last: " + fruits.lastElement());

        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }

}
