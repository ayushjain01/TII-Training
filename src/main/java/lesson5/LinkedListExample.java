package lesson5;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("India");
        list.add("USA");
        System.out.println("Using add");
        System.out.println(list);
        list.add(1,"Australia");
        System.out.println("Inserting at a specific index");
        System.out.println(list);
        list.addFirst("Singapore");
        System.out.println("Using addFirst");
        System.out.println(list);
        list.addLast("New Zealand");
        System.out.println("Using addLast");
        System.out.println(list);
    }
}
