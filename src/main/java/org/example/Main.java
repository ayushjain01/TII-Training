package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Target!");
        Student student1 = new Student("Ayush", 20, true);
        Student student2 = new Student("Sanidhya");

        System.out.println("Student2 age - " + student2.age);

        //Static keyword
        System.out.println("Student college - "  + Student.college);
        int sum = Utils.add(student1.age, student2.age);
        System.out.println("Using static method from Util = " + sum);
    }
}