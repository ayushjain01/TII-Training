package lesson6;

public class GenericType<T> {
    private T t;

    public T get(){
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }
    public String getClassName(){
        return t.getClass().getName();
    }

    public static void main(String[] args) {
        GenericType<String> type = new GenericType<>();
        type.set("Ayush");
        System.out.println(type.get() + " " + type.getClassName());
        GenericType type2 = new GenericType();
        type2.set("Ayush");
        System.out.println(type2.get() + " " + type2.getClassName());
        type2.set(10);
        System.out.println(type2.get() + " " + type2.getClassName() );;

    }
}
