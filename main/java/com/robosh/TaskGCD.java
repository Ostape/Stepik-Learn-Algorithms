package com.robosh;

public class TaskGCD {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return gcd(a%b,b);
        }
            return gcd(a, b%a);
    }
}
