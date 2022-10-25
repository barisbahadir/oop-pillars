package com.company;

import java.util.HashMap;
import java.util.Map;

public class CodeExample {
    private Map<String,Integer> map;

    public CodeExample() {
        map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 3);
    }

    public int getValue(String input, int numRetries) throws Exception {
        try {
            return map.get(input);
        }
        catch (Exception e) {
            if (numRetries > 3) {
                throw e;
            }
            return getValue(input, numRetries + 1);
        }
    }
}