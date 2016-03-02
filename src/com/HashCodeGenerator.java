package com;

import static java.lang.Integer.parseInt;

public class HashCodeGenerator<T>{
    public HashCodeGenerator(){
    }

    public int generateHashCodeOf(T key){
        MyHashMap<Object, Object> hashMap = new MyHashMap<>();
        return (key.hashCode())%hashMap.size;

    }
}

