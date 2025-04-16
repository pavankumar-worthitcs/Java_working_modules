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

        Map<String,List<Person>> groupedPersons =list.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        System.out.println(groupedPersons);

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
