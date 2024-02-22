package Lesson4;

public class MyThread extends Thread{
    int multiplicand;
    int sleepTime;
    MyThread(String name, int multiplicand, int sleepTime) {
        super(name);
        this.multiplicand = multiplicand;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(this.sleepTime);
                System.out.println(Thread.currentThread().getName()+"-"+i*multiplicand);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}