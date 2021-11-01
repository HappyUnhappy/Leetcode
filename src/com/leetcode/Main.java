package com.leetcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* int[] nums = {0, 0, 1, 1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1};
        int[] nums3 = {1, 1, 2};

	    RemoveDuplicatesFromSortedArray object = new RemoveDuplicatesFromSortedArray();
        int result = object.removeDuplicates(nums);
        int result2 = object.removeDuplicates(nums2);
        int result3 = object.removeDuplicates(nums3);

        System.out.println("Test 1. Result = " + result + " and nums = " + Arrays.toString(nums));
        System.out.println("Test 2. Result = " + result2 + " and nums = " + Arrays.toString(nums2));
        System.out.println("Test 3. Result = " + result3 + " and nums = " + Arrays.toString(nums3));

        int[] nums = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        ContainsDuplicate object = new ContainsDuplicate();
        boolean result = object.containsDuplicate(nums);
        boolean result2 = object.containsDuplicate(nums2);
        boolean result3 = object.containsDuplicate(nums3);

        System.out.println("Test 1. Result = " + result + " and nums = " + Arrays.toString(nums));
        System.out.println("Test 2. Result = " + result2 + " and nums = " + Arrays.toString(nums2));
        System.out.println("Test 3. Result = " + result3 + " and nums = " + Arrays.toString(nums3)); */

        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {1, 0};
        int[] nums3 = {2, 1};

        MoveZeroes object = new MoveZeroes();
        object.moveZeroes(nums);
        object.moveZeroes(nums2);
        object.moveZeroes(nums3);

        System.out.println("Test 1. Result = " + Arrays.toString(nums));
        System.out.println("Test 2. Result = " + Arrays.toString(nums2));
        System.out.println("Test 3. Result = " + Arrays.toString(nums3));
    }
}
