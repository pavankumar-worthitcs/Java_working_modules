package Java_8_To_21_Features;

import java.util.ArrayList;
import java.util.List;

record Person(int personId,String personName){}
public class PatternMaching {

    public static void main(String[] args) {

        // type pattern -> used match target data with the pattern type;
        Object o = "Hello";

        if(o instanceof String s){ // if it of same type then String s will be created, it can be used locally
            System.out.println(s);
        }



        //Record Pattern
        Object p = new Person(30,"akhil");
        if(p instanceof Person person){
            System.out.println("Id :"+person.personId()+"  Name : "+person.personName());
        }




        List<Person> persons = new ArrayList<>();
        persons.add(new Person(10,"salt"));
        persons.add(new Person(11," p salt"));
        persons.add(new Person(12,"a salt"));

        //enhanced for loop -> it is also pattern matching
//       for(Person(int Id,String name): persons){      //it is also matches the patterns.
//
//       }



    }
}
