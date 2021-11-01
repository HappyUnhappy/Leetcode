package com.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int inputArrayLength = nums.length;

        if (inputArrayLength <= 1) {
            return inputArrayLength;
        }

        int uniqueArrayNumbersCount = 1;
        int previousNumber = nums[0];
        int switchNumberIndex = -1;

        for (int i = 1; i < inputArrayLength; ++i) {
            if (nums[i] != previousNumber) {
                ++uniqueArrayNumbersCount;
                previousNumber = nums[i];

                if(switchNumberIndex != -1) {
                    nums[switchNumberIndex] = nums[i];
                    ++switchNumberIndex;
                }
            } else if (switchNumberIndex == -1){
                switchNumberIndex = i;
            }
        }

        return uniqueArrayNumbersCount;
    }
}
