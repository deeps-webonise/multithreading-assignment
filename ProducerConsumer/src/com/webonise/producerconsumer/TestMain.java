package com.webonise.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> itemsList = new ArrayList<Integer>();
        Thread tProducer = new Thread(new Producer(itemsList), "com.webonise.producerconsumer.Producer");
        Thread tConsumer = new Thread(new Consumer(itemsList), "com.webonise.producerconsumer.Consumer");
        tProducer.start();
        tConsumer.start();
    }
}
