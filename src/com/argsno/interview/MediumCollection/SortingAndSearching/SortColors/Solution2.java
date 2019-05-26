package com.argsno.interview.MediumCollection.SortingAndSearching.SortColors;

public class Solution2 {
    void sortColors(int A[], int n) {
        int p1 = 0, p2 = A.length - 1, index = 0;
        while (index <= p2) {
            if (A[index] == 0) {
                A[index] = A[p1];
                A[p1] = 0;
                p1++;
            }
            if (A[index] == 2) {
                A[index] = A[p2];
                A[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }
}
