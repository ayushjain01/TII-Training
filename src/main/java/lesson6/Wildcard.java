package lesson6;
import java.util.*;

abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    String brand;
    void start(){
        System.out.println("Car starting");
    }
    String getBrand(){
        return this.brand;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    void printBrand(){
        System.out.println("Car Brand - " + this.brand);
    }
}
class Nissan extends Car{
    Nissan(){
        super.setBrand("Nissan");
    }
    String getBrand(){
        return this.brand;
    }
    void printBrand(){
        System.out.println("This is a Nissan car.");
    }
}
class Toyota extends Car{
    Toyota(){
        super.setBrand("Toyota");
    }
    String getBrand(){
        return this.brand;
    }
    void printBrand(){
        System.out.println("This is a Toyota car.");
    }
}

class Magnite extends Nissan{
    Magnite(){
        super();
    }
    void printBrand(){
        System.out.println("This is a Nissan Magnite car.");
    }
}
class Variant extends Magnite{
    Variant(){
        super();
    }
    void printBrand(){
        System.out.println("This is a Nissan Magnite Variant car.");
    }
}

class SubVarient extends Variant{
    SubVarient(){
        super();
    }
    void printBrand(){
        System.out.println("This is a Nissan Magnite SubVarient car.");
    }
}
class Wildcard{
    //upper bound
    public static void printCar(List<? extends Car> lists){
        for(Car c:lists){
            c.printBrand();
        }
    }
    //unbounded
    public static void displayCar(List<?> lists){
        for(Object c:lists){
            System.out.println(c);
        }
    }
    //lower bound
    public static void showCar(List<? super SubVarient> lists){
        for(Object c:lists){
            System.out.println(c);
        }
    }
    public static void main(String[] args){

        List<Nissan> list1=new ArrayList<Nissan>();
        list1.add(new Nissan());

        List<Toyota> list2=new ArrayList<Toyota>();
        list2.add(new Toyota());
        list2.add(new Toyota());

        System.out.println("Upper bound");
        printCar(list1);
        printCar(list2);

        List<Car> list3=new ArrayList<Car>();
        list3.add(new Nissan());
        list3.add(new Magnite());
        list3.add(new Magnite());
        list3.add(new Variant());
        list3.add(new Car());
        list3.add(new SubVarient());
        System.out.println("Lower bound");
        showCar(list3);

        List<Number> list4 = new ArrayList<Number>();
        list4.add(4);
        list4.add(1235678);
        list4.add(0.2833);
        list4.add(-100);
        System.out.println("Unbounded");
        displayCar(list4);
        displayCar(list3);
        displayCar(list2);
        displayCar(list1);

    }
}