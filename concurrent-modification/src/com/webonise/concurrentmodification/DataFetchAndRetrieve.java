package com.webonise.concurrentmodification;

import java.util.ArrayList;
import java.util.List;

public class DataFetchAndRetrieve {
    private final List<String> myList;

    public DataFetchAndRetrieve() {
        //ConcurrentModificationException will be thrown
        //This is because we are simultaneously traversing and modifying(removing) the element
        //So we are concurrently trying to traverse and modify the element
        myList = new ArrayList<>();
    }

    void addData() {
        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add("fourth");
        myList.add("fifth");
    }

    void printDataAndRemove() {
        for (String string : myList) {
            System.out.println(string);
            myList.remove("third");
        }
    }


}

