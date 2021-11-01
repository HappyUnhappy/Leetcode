package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int element : nums) {
            if (uniqueNumbers.contains(element)) {
                return true;
            } else {
                uniqueNumbers.add(element);
            }
        }

        return false;
    }
}
