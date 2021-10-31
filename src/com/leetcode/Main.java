package com.leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1};
        int[] nums3 = {1, 1, 2};

	    RemoveDuplicatesFromSortedArray object = new RemoveDuplicatesFromSortedArray();
        int result = object.removeDuplicates(nums);
        int result2 = object.removeDuplicates(nums2);
        int result3 = object.removeDuplicates(nums3);

        System.out.println("Test 1. Result = " + result + " and nums = " + Arrays.toString(nums));
        System.out.println("Test 2. Result = " + result2 + " and nums = " + Arrays.toString(nums2));
        System.out.println("Test 3. Result = " + result3 + " and nums = " + Arrays.toString(nums3));
    }
}
