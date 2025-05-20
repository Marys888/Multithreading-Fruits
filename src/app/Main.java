package app;

public class Main {
    public static void main(String[] args) {
        DataHandler dh = new DataHandler();
        MyThread myThread1 = new MyThread("Thread1", dh);
        MyThread myThread2 = new MyThread("Thread2", dh);

        myThread1.start();
        myThread2.start();
    }
}
