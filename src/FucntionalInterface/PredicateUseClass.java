package FucntionalInterface;


import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class PredicateUseClass {
    public static void main(String[] args) {

        TreeMap<Integer,String> data = new TreeMap<>();
        data.put(101,"allen");
        data.put(102,"");
                data.put(103,"");
                data.put(104,"peter");

                //creating a implementation to a string, whether it is valid or not.
        Predicate<String> checkDataValuesIsValidOrNot = (String::isEmpty);

        //Fetching one by one entry
        for(Map.Entry<Integer,String> dataValidation : data.entrySet()){

            // checking whether user data is valid or not !
            if(checkDataValuesIsValidOrNot.test(dataValidation.getValue())){

                //if it is not valid then, we are displaying invalid along with the user Id
                System.out.println("User Id : "+dataValidation.getKey()+" has Invalid value");
            }
        }

    }
}
