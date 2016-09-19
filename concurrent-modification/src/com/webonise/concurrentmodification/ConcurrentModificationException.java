package com.webonise.concurrentmodification;

import java.util.*;

public class ConcurrentModificationException {

    public static void main(String args[]) {
        List<String> myList = new ArrayList<String>();

        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add("fourth");
        myList.add("fifth");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("List" + value);
            if (value.equals("third")){
                myList.remove(value);
                //com.webonise.concurrentmodification.ConcurrentModificationException is thrown
                //Because we are removing and traversing concurrently
            }
        }
    }
}