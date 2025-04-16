package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {

        LinkedHashMap<Object,String> l_h_m = new LinkedHashMap<>();
        l_h_m.put("Steve","smith");
        l_h_m.put(101,"bieber");
        l_h_m.put(100,"Jake");
        l_h_m.put(true,"Fraser");

        // It Maintains insertion order
        System.out.println(l_h_m); // {Steve=smith, 101=bieber, 100=Jake, true=Fraser}

        //removing the entry based on key
        l_h_m.remove(true);

        //forEach()
        l_h_m.forEach((key,value)->{
            System.out.println("Key : "+key+" Value : "+value);
        });

        //Using Entryset()
        for( Map.Entry<Object,String> i : l_h_m.entrySet()){
            System.out.println("Key : "+i.getKey()+", Value : "+i.getValue());
        }
    }
}
