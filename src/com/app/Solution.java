package com.app;

import java.util.Set;

public class Solution {

    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    private void permutationFinder(String str, int l, int r, Set<String> result) {
        if (l == r) {
            result.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutationFinder(str, l + 1, r, result);
                // str = swap(str, l, i);
            }
        }
    }

    public void permutationFinder(String str, Set<String> result) {
        permutationFinder(str, 0, str.length() - 1, result);
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    private String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
