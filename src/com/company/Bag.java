package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> bag = new ArrayList<>();

    public void add(T person){
       bag.add(person) ;
    }
    public void remove(T person){
        bag.remove(person);
    }

    public void clearAll(){
       bag.clear();
    }

    @Override
    public String toString() {
        return "Bag{" +
                "bag=" + bag +
                '}';
    }
}
