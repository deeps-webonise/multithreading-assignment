package com.webonise.concurrentmodification;

public class ConcurrentModificationResolved {
    public static void main(String args[]) {
        DataFetchAndRetrieve dataFetchAndRetrieve = new DataFetchAndRetrieve();
        dataFetchAndRetrieve.addData();
        dataFetchAndRetrieve.printDataAndRemove();
        System.out.println();
        dataFetchAndRetrieve.printData();
    }
}


