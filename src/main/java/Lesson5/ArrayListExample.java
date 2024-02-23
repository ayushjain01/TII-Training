package Lesson5;

import java.util.*;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("India");
        list.add("USA");
        list.add("Australia");
        list.add("Singapore");
        list.add("New Zealand");
        list.add("Malaysia");

        System.out.println("Printing Directly");
        System.out.println(list);

        System.out.println("Printing using iterator");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Using for each");
        for(String country: list){
            System.out.println(country);
        }

    }
}