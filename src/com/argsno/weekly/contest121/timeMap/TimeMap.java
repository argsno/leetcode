package com.argsno.weekly.contest121.timeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    private Map<String, LinkedHashMap<Integer, String>> m;
    public TimeMap() {
        m = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!m.containsKey(key)) {
            m.put(key, new LinkedHashMap<>());
        }
        LinkedHashMap<Integer, String> subMap = m.get(key);
        subMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!m.containsKey(key)) {
            return "";
        }
        LinkedHashMap<Integer, String> subMap = m.get(key);
        List<Integer> subMapKeys = new ArrayList<>(subMap.keySet());
        Collections.reverse(subMapKeys);
        for (int i = 0; i < subMapKeys.size(); i++) {
            if (subMapKeys.get(i) <= timestamp) {
                return subMap.get(subMapKeys.get(i));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        TimeMap kv = new TimeMap();
        kv.set("foo", "bar", 1);
        System.out.println(kv.get("foo", 1));
        System.out.println(kv.get("foo", 3));
        kv.set("foo", "bar2", 4);
        System.out.println(kv.get("foo", 4));
        System.out.println(kv.get("foo", 5));
    }
}
