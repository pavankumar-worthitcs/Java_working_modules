package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
       //initial capacity is 16.

        LinkedHashSet<Object> sets = new LinkedHashSet<>();
        sets.add("Software");
        sets.add(20);
        sets.add(30.5);
        sets.add('A');
        sets.add(true);
        sets.add(null);
        sets.add(null); //it will not added to the set, due to set does not allows duplicates
        System.out.println(sets.size());

       // it maintains insertion order
        System.out.println("first element : "+sets.getFirst());
        System.out.println("Last element : "+sets.getLast());

        sets.remove(null); // null is removed from the set
        System.out.println(sets);

    }
}
