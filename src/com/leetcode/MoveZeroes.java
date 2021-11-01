package com.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0, zeroIndex = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                if(i != zeroIndex) {
                    nums[zeroIndex] = nums[i];
                    nums[i] = 0;
                }
                ++zeroIndex;
            }
        }
    }
}
