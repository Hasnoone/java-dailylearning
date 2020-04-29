package com.study.dailylearning.algorithm.leetcode.isPalindrome;

/**
 *
 * @description: Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * @create: 2020-01-11
 **/
public class IsPalindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);


        System.out.println("answer is " + palindrome);
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        String sourceValue = String.valueOf(x);
        if (sourceValue.length() == 0) {
            return false;
        }

        int head = 0;
        int tail = sourceValue.length() - 1;

        while (head <= tail) {
            if (sourceValue.charAt(head) != sourceValue.charAt(tail)) {
                result = false;
                break;
            } else {
                head++;
                tail--;
            }
        }
        return result;
    }
}

