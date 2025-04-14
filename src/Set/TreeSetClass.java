package Set;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30); //it ignores the duplicates
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers); // by default, the elements arrange in ascending order.

        //if it is custom object, should provide comparable implementation or comparator.
        System.out.println(numbers.higher(10)); // it returns element which is next to the specified element
        System.out.println(numbers.lower(50));  // it returns element which is previous to specified element

    }
}
