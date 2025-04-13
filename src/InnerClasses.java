import java.util.ArrayList;

public class InnerClasses {

    public static void main(String[] args){

        A a = new A();
        A.B b = a.new B();
        b.add();

        ArrayList<String> list = new ArrayList<>();
        list.add("bob");
        list.add("rahul");
        list.add("allen");
        list.add("philip");

        list.forEach(System.out::println);



    }

}

class A {
    int a = 20;
    int b = 20;
    class B{
        public void add(){
            System.out.println(a+b);
        }

    }

}
