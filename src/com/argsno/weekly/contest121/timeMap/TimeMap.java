package com.argsno.weekly.contest121.timeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {
    private Map<String, TreeMap<Integer, String>> m;

    public TimeMap() {
        m = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!m.containsKey(key)) {
            m.put(key, new TreeMap<>());
        }
        TreeMap<Integer, String> subMap = m.get(key);
        subMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!m.containsKey(key)) {
            return "";
        }
        TreeMap<Integer, String> subMap = m.get(key);
        Map.Entry<Integer, String> res = subMap.floorEntry(timestamp);
        if (res != null) {
            return res.getValue();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        TimeMap kv = new TimeMap();
        kv.set("foo", "bar", 1);
        System.out.println(kv.get("foo", 1));
        System.out.println(kv.get("foo", 3));
        kv.set("foo", "bar2", 4);
        System.out.println(kv.get("foo", 4));
        System.out.println(kv.get("foo", 0));
    }
}
