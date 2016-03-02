package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adarshasa on 01/03/16.
 */
public class MyHashMapTest {
    @Test
    public void testFoo() throws Exception {
        MyHashMap<String, String> hashMap = new MyHashMap<>();
        hashMap.put("India","Delhi");
        hashMap.put("India","hh");
//        assertEquals(hashMap.get("India"), "Delhi");
    }
}
11