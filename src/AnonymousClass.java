public class AnonymousClass {

    public static void main(String[] args){

        I i = new I(){
            @Override
            public void msg() {
                System.out.println("Anonymous Message");
            }
        };
        i.msg();

    }

}

interface I{
    void msg();
}
