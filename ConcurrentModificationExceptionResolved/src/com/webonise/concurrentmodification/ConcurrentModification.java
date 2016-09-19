package com.webonise.concurrentmodification;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by webonise on 19/9/16.
 */
public class ConcurrentModification {
    public static void main(String args[]) {
        //To avoid  ConcurrentModificationException we will useCopyOnWriteArrayList
        List<String> myList = new CopyOnWriteArrayList<>();

        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add("fourth");
        myList.add("fifth");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("List:" + value);
            if (value.equals("third")){
                myList.remove(value);
            }
        }
    }

}
