package com.argsno.tag.backtracking.LetterCasePermutation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution3 {
    public List<String> letterCasePermutation(String S) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();
                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }
        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {

    }
}
