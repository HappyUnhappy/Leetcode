package com.leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int result = - 1;
        int startIndexPosition = 0;
        int endIndexPosition = nums.length - 1;

        while (startIndexPosition <= endIndexPosition) {
            int mediumIndexPosition = (startIndexPosition + endIndexPosition) / 2;

            if (target == nums[mediumIndexPosition]) {
                result = mediumIndexPosition;
                break;
            } else if (target < nums[mediumIndexPosition]) {
                endIndexPosition = mediumIndexPosition - 1;
            } else {
                startIndexPosition = mediumIndexPosition + 1;
            }
        }

        return result;
    }
}
