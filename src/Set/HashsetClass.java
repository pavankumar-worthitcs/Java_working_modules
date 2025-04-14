package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClass {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(30);//it will not be added and set remains unchanged due to duplication.
        System.out.println(numbers.size()); // 2
        numbers.add(50);
        numbers.add(60);

        Iterator<Integer> nums  =numbers.iterator();
        while(nums.hasNext()){
            System.out.println(nums.next());
        }



    }
}
