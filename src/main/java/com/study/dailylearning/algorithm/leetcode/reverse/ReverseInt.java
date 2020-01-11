package com.study.dailylearning.algorithm.leetcode.reverse;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-01-11
 **/
public class ReverseInt {

    public static void main(String[] args) {
//        int reverse = reverse(-123);
        int reverse = reverse2(-123);
        System.out.println(reverse);
    }


    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) res;
        }

    }


    public static int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

