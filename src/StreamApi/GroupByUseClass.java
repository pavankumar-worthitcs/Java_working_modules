package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByUseClass {
    public static void main(String[] args) {

        List<Person> list  = new ArrayList<>();
        Collections.addAll(list,new Person("pavan","Hyderabad")
                ,new Person("vamshi","Hyderabad")
                ,new Person("kishor","Bangalore")
                ,new Person("shekar","Bangalore"));

        Map<String,Long> countOfPeopleAlongWithCities =list.stream()
                .collect(Collectors.groupingBy(Person::getCity , Collectors.counting()));



        for(Map.Entry<String,Long> persons: countOfPeopleAlongWithCities.entrySet()){
            System.out.println(persons.getValue()+" are from "+persons.getKey());
        }


    }

}

class Person {

   private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
