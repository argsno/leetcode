package com.argsno.interview.EasyCollection.SortingAndSearching.FirstBadVersion;

import com.argsno.VersionControl;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (isBadVersion(middle)) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return end + 1;
    }
}
