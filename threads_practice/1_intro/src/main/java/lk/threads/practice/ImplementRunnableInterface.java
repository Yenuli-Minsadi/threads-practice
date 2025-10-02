package lk.threads.practice;

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("run...");
    }
}
