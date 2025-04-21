package Java_8_To_21_Features;

//Support if you want to give access to inherit properties to specific classes,
// then we make use of sealed classes.
// permits is keyword which give access to classes.
// syntax:  sealed class ClassName permits Class1,Class2 { }

sealed class Vehicle permits Bike,Car,Auto{
    public void go(){
        System.out.println("going....");
    }
}
// we can make this class as sealed,non-sealed,final.
//if we make subclass as sealed again it should permit some classes.
//if we make non-sealed, any class can inherit from it.
//if we make final no class can inherit properties
non-sealed class Bike extends Vehicle{

}
non-sealed class Car extends Vehicle{

}
non-sealed class Auto extends Vehicle{

}

//class Person extends Vehicle{ // it will throw error due to vehicle class not permitting Person class to inherit.
//
//}

public class SealedClasses {
    public static void main(String[] args) {
    Bike bike = new Bike();
    bike.go();
    }
}
