package Map;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer,Object> t_m = new TreeMap<>();
        t_m.put(101,"Pavan");
        t_m.put(106,true);
        t_m.put(109,"sai");
        t_m.put(104,3000);

        //Keys should be of Homogenous and by default it maintains ascending order
        System.out.println(t_m);

        //fetching the entry's by using java 8 forEach()
        t_m.forEach((key,value) -> System.out.println("Key : "+key+", Value : "+value));

        System.out.println(t_m.containsKey(104)); //checking whether key is exist or not
        System.out.println(t_m.containsValue(true)); // checking whether value is exist or not

    }
}
