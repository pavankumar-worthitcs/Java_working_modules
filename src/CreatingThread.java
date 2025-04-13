//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CreatingThread {

    public static void main(String[] args){
        Thread thread = new Thread(() -> System.out.println("Thread is created by using lambda"));

        thread.setName("Testing Thread");
        thread.setPriority(10);

        System.out.println("Thread name is "+thread.getName());
        System.out.println("Thread Id is "+thread.getId());
        System.out.println("Thread name is "+thread.getPriority());

        thread.start();





        }

}
class Test extends Thread{

    @Override
    public void run() {
    }
}