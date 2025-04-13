public class Generics {

    public static void main(String[] args) {
        Type<Integer> type = new Type<>();
        type.setData(30);
        System.out.println(type.data.getClass().getName());
    }

}
class Type<T>{
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}



