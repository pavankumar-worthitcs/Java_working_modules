public class Syncronization{

    public static void main(String[] args) throws Exception {
        Count co = new Count();
        Thread t1 = new Thread(()->{
                for(int i = 0; i < 1000;i++){
                   co.increment();
                }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i < 1000;i++){
                co.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println("count is "+co.count);
    }

}
class Count{
    int count;
    public synchronized void increment(){
        count++;
    }
}
