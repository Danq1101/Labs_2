package com.example.service.impl;

import com.example.service.WordSearch;

import java.util.HashMap;

public class WordSearchImpl implements WordSearch {

    private HashMap<Integer, String> map = new HashMap<>();
    {
        map.put(1, "Daniil");
        map.put(2, "Egor");
        map.put(3, "Dima");
        map.put(4, "Senya");
    }


    @Override
    public String findInfoKey(Integer key) {
        return map.get(key);
    }

    public String findInfoValue(String value){



        if (map.containsValue(value))
            System.out.println(map);


        return value;
    }

    @Override
    public void changeInfo(Integer key, String value) {
        map.replace(key, value);
    }
}
