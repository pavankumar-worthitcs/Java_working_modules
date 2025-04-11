public class LambdaExpression {

    public static void main(String[] args){

        Task task = (a,b) -> System.out.println(a+b);
        task.doo(5,15);

    }
}

interface Task{
    void doo(int a , int b);
}
