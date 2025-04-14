package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Allen",90);
        marks.put("Peter",57);
        marks.put("Mask",null); //it allows Multiple null in values,and for keys it should be unique
        marks.put("Mask",30); // it is duplicate key, therefore it ignores
        marks.put("Salt",null);
        System.out.println(marks.size()); // 4

        marks.replace("Salt",null,98); // replacing the values
        System.out.println(marks);

        //Checking if a key exists
        System.out.println("Key Exists : "+marks.containsKey("Mask"));


        //iterating over hashmap(using java 8)
           marks.forEach((key,value)-> System.out.println("Key : "+key+"   Value : "+value));

           //using keyset()
        for(String key :marks.keySet()){
            System.out.println(key);
        }

        //using values()
        for(Integer i : marks.values()){
            System.out.println(i);
        }

        //using Entry set()
        for( Map.Entry<String,Integer> entry : marks.entrySet()){
            System.out.println("Key : "+entry.getKey() + "  Value : "+entry.getValue());
        }


          }

}
