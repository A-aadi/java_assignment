package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adarshasa on 01/03/16.
 */
public class MyHashMapTest {
    @Test
    public void test_hashMap_put_function_should_add_key_and_value() throws Exception {
        MyHashMap<String, String> hashMap = new MyHashMap<>();
        hashMap.put("India","Delhi");
        assertEquals(hashMap.get("India"), "Delhi");
    }

    @Test
    public void hashMap_put_function_should_replace_previous_value_if_new_key_is_already_stored() throws Exception {
        MyHashMap<String, String> hashMap = new MyHashMap<>();
        hashMap.put("India","Lucknow");
        assertEquals(hashMap.get("India"), "Lucknow");
    }
}