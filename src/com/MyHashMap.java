package com;

public class MyHashMap<K, V> extends HashCodeGenerator{
    private LinkedList [] list;
    final int size = 99 ;

    public MyHashMap() {
        super();
        this.list = new LinkedList [this.size];
    }

    public void put(K key, V value) {
        int index =  super.generateHashCodeOf(key);
        if(this.list[index] == null || this.list[index].key == key) {
            LinkedList<K, V> linkedList = new LinkedList<>(key, value);
            this.list[index] = linkedList;

        }else {
            LinkedList<K, V> linkedList = new LinkedList<>(key, value);
            this.list[index].setNext(linkedList) ;
        }
    }

    public V get(K key) {
        int index = super.generateHashCodeOf(key);
        LinkedList<K,V> ll =this.list[index];
        return ll.value;
    }
}