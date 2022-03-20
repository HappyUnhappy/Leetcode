package com.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {

    private boolean isOpenBracket(char ch) {
        return switch (ch) {
            case '(', '{', '[' -> true;
            default -> false;
        };
    }

    private boolean isParentheses(char open, char close) {
        return switch (close) {
            case ')' -> open == '(';
            case '}' -> open == '{';
            case ']' -> open == '[';
            default -> false;
        };
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char a = stack.pop();
                if (!isParentheses(a, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
