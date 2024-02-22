package Lesson4;

public abstract class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("thread1",10, 100);
        t1.start();
        MyThread t2 = new MyThread("thread2", 100, 200);
        t2.start();

        // using run directly instead of start
//        t1.run();
//        t2.run();

        for(int i=1;i<5;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"-"+i*1000);
        }

    }
}