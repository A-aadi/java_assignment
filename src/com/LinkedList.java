package com;

/**
 * Created by adarshasa on 02/03/16.
 */
public class LinkedList<K, V> {
    K key;
    V value;
    LinkedList next = null;

    public LinkedList(K key,V value) {
        this.key = key;
        this.value = value;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
