package com;

/**
 * Created by adarshasa on 02/03/16.
 */
public class LinkedList<K, V> {
    K key;
    V value;
    static LinkedList next = null;

    public LinkedList() {
//        this.key = key;
//        this.value = value;
//        this.next = null;
    }

    public void setKey(K key){
        this.key = key;
    };

    public void setValue(V value) {
        this.value = value;
    };

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
