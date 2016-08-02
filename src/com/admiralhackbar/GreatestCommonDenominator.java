package com.admiralhackbar;

/**
    https://www.reddit.com/r/dailyprogrammer/comments/4uhqdb/20160725_challenge_277_easy_simplifying_fractions/
*/
public class GreatestCommonDenominator {

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(3, 15));
        System.out.println(gcd(4, 8));
        System.out.println(gcd(4096, 1024));
    }
}
