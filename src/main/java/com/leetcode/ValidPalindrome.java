package com.leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.isBlank()) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                ++i;
                continue;
            }

            if (!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))) {
                --j;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }
}
