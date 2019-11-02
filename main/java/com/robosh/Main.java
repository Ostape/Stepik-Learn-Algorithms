package com.robosh;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final int a = 4;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(isPowerOfTwo(number));
//        System.out.println(5 >> 1);\
        final int a  = 2;
    }

    public static boolean isPowerOfTwo(int value) {
        if (value == -1 || value == 1){
            return true;
        }
        return Integer.lowestOneBit(value) != 1;
    }
}

 class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof ComplexNumber)) return false;
         ComplexNumber that = (ComplexNumber) o;
         return Double.compare(that.getRe(), getRe()) == 0 &&
                 Double.compare(that.getIm(), getIm()) == 0;
     }

     @Override
     public int hashCode() {
         return Objects.hash(getRe(), getIm());
     }
 }