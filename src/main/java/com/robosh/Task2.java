package com.robosh;

public class Task2 {
    public static int getLastNumberFib(int n) {
        int a = 0;
        int b = 1;

        int m = 1;

        while (n != m){
            m++;
            a = (a + b)%10;
            int temp = b;
            b = a;
            a = temp;
        }
        return b;
    }
}
