package Set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetClass {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30); //it ignores the duplicates
        numbers.add(40);
     // numbers.add(null); for null in the case of object type, it will throw  NullPointerException.

        // numbers.add("string"); // for other data type comparing to first entry, it will throw ClassCastException.

        System.out.println(numbers); // by default, the elements arrange in ascending order.

        //if it is custom object, should provide comparable implementation or comparator.
        System.out.println(numbers.higher(10)); // it returns element which is next to the specified element
        System.out.println(numbers.lower(50));  // it returns element which is previous to specified element

        Stream<Integer> s_stream = numbers.stream().sorted((first, second)-> second.intValue() - first);
        System.out.println();
    }
}
