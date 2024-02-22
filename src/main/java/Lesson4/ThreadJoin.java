package Lesson4;

public class ThreadJoin {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("Thread1", 10, 300);
        MyThread th2 = new MyThread("Thread2", 20, 300);
        MyThread th3 = new MyThread("Thread3", 30, 300);
        MyThread th4 = new MyThread("Thread4", 40, 300);
        th1.start();

        try {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        th2.start();
        try {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Starting Thread3 and Thread4");
        th3.start();
        th4.start();

    }
}
