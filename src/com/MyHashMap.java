package com;

public class MyHashMap<K, V> extends HashCodeGenerator{
    private Object [] list;
    final int size = 99 ;

    public MyHashMap() {
        super();
        this.list = new Object [this.size];
    }

    public void put(K key, V value) {
        int index =  super.generateHashCodeOf(key);
        System.out.println();
        if(list[index] == null) {
            LinkedList<K, V> linkedList = new LinkedList<>();
            linkedList.setKey(key);
            linkedList.setValue(value);
            this.list[index] = linkedList;

        }else {
//            this.list[index].next =
        }
    }

    public V  get(K key) {
        int index = super.generateHashCodeOf(key);
        return (V) this.list[index];
    }
}