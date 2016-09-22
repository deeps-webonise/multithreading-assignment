package com.webonise.concurrentmodification;

public class ConcurrentModificationDemo {
    public static void main(String args[]) {
        DataFetchAndRetrieve dataFetchAndRetrieve = new DataFetchAndRetrieve();
        dataFetchAndRetrieve.addData();
        dataFetchAndRetrieve.printDataAndRemove();
    }
}

