package lesson7;

public class lambda {
    public static void main(String[] args) {
        BirdImpl myBird = new BirdImpl();
        myBird.fly();

        Bird b2 = () -> {System.out.println("I'm flying high up in the sky.");};
        b2.fly();

        //method reference
        Bird b3 = MethodReference::someFun;
        b3.fly();

        //constructor reference
        Bird b4 = ConstructorReference::new;
        b4.fly();
    }
}
