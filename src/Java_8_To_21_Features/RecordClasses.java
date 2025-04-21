package Java_8_To_21_Features;

//Record is special type of class designed to hold data, when you declare a record, java automatically generate.
// private final fields
// A constructor
// getters
// toString(), equals(),hashCode()

record User(int userId,String userName){

}

//drawbacks
// we cannot modify the private final fields.
// there are no setters.

public class RecordClasses {

    public static void main(String[] args){
        User user = new User(10,"Salt");

        System.out.println(user.userId());
        System.out.println(user.userName());
    }
}
