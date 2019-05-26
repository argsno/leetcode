package com.argsno.interview.MediumCollection.ArrayAndStrings.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return Collections.emptyList();
        }
        Map<String, List<String>> m = new HashMap<>();
        for (String str :
                strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sorted = String.valueOf(s);
            if (!m.containsKey(sorted)) {
                m.put(sorted, new ArrayList<>());
            }
            m.get(sorted).add(str);
        }
        return new ArrayList<>(m.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        }));
    }
}
