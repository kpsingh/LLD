package com.java.lld.designpatterns.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String str = "abababba";
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        int oddCount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        int result = oddCount == 0 ? 27 : 2;
        System.out.println(result);
    }
}
