package lesson1;

public class Student {
    String name;
    int age;
    boolean isEligible;
    static String college = "RIT";

    //parameterized constructor
    public Student(String name, int age, boolean isEligible) {
        //this(name, age);
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.isEligible = true;
    }

    public Student(String name) {
        this.name = name;
        this.age = 21;
        this.isEligible = true;
    }

    public Student(){
        this.name = "";
        this.age = 18;
        this.isEligible = true;
    }
}