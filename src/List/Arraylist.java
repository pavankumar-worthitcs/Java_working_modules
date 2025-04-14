package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>(); // this is Generic type

//        ArrayList al1 = new ArrayList(); // This is Raw type
        al.add("Hello"); // add(T t) used to add the element
        al.add(1, "Allen"); // add(int index,T t) adding element at a particular index
        System.out.println(al.get(1)); // to get the element from particular index
        al.set(1, "Sai"); //  Replaces the element at specified index
        al.remove(1); // Removes the element at the specified index.
        System.out.println(al.contains("Hello")); // Checks if the list contains the specified element
        al.indexOf("Sai"); //Returns the index of the first occurrence of the element.
        al.clear(); //Removes all elements from the list.


        //forEach loop
        al.add("allen");
        al.add("Peter");
        al.add("Lilly");

        for(String s : al){
            System.out.println(s);
        }

        //List Iterator
        ListIterator<String> list =al.listIterator();

        while(list.hasNext())
            System.out.println(list.next());



    }
}
