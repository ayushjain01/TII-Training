package lesson5;
import java.util.*;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("ayush", 21));
        students.add(new Student("sanidhya", 21));
        students.add(new Student("aman", 12));
        students.add(new Student("adeeb", 21));
        students.sort(Comparator.comparingInt(Student::getAge)
                .thenComparing(Student::getName));
        for(Student a: students){
            System.out.println("Name: " + a.getName() + " Age: " + a.getAge());
        }
    }
}
class Student {
    String name;
    int age;
    public Student(String name,  int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
    String getName() {
        return this.name;
    }
}