package com.webonise.joinandsynchronized;

//This program shows the use of join method and making method synchronized
public class JoinAndSynchronizedDemo implements Runnable {

    private static int count =0;

    public static synchronized void incrementCount() {
        count++;
        /* this is a synchronized function i.e it allows only one thread to execute at a time.
        If synchronized would not have been there the output would have been always some random value
        This is because both the threads would access the count variable at the same time and would increment the value only once
        */
    }

    public void run() {
        for(int i=0; i<10000; i++) {
            incrementCount();
        }
    }

    public static void main(String [] args) {
        Thread thread1 = new Thread(new JoinAndSynchronizedDemo());
        Thread thread2 = new Thread(new JoinAndSynchronizedDemo());
        thread1.start();
        thread2.start();

        try {
            thread1.join();//The main thread would wait for thread 1 to execute and then only will it continue its execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();//The main thread would wait for thread 2 to execute and then only will it continue its execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("value " + count);
    }

}






