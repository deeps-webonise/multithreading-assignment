package com.webonise.joinandsynchronized;

public class TestMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new JoinAndSynchronizedDemo());
        Thread thread2 = new Thread(new JoinAndSynchronizedDemo());
        thread1.start();
        thread2.start();

        try {
            thread1.join();//The main thread would wait for thread 1 to execute and then only will it continue its execution
            thread2.join();//The main thread would wait for thread 2 to execute and then only will it continue its execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("value " + JoinAndSynchronizedDemo.count);
    }
}
