package com.webonise.joinandsynchronized;

//This program shows the use of join method and making method synchronized
public class JoinAndSynchronizedDemo implements Runnable {

    static int count = 0;

    private static synchronized void incrementCount() {
        count++;
        /* this is a synchronized function i.e it allows only one thread to execute at a time.
        If synchronized would not have been there the output would have been always some random value
        This is because both the threads would access the count variable at the same time and would increment the value only once
        */
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            incrementCount();
        }
    }
}






