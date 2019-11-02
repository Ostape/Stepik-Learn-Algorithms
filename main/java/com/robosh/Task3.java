package com.robosh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
            System.out.println(n);
            return;
        }
        int temp = n;
        List<Integer> naturalNumbers = new ArrayList<>();
        naturalNumbers.add(1);

        int sum = naturalNumbers.get(0);

        for (int i = 0; i < naturalNumbers.size(); i++) {
            int currentValue = naturalNumbers.get(i);

            int k = n - sum;

            if (k - (currentValue+1) >= currentValue + 2) {
                sum += currentValue+1;
                naturalNumbers.add(currentValue +1);
            }
            else {
                naturalNumbers.add(k);
                break;
            }
        }

        System.out.println(naturalNumbers.size());
        for(int a : naturalNumbers){
            System.out.print(a + " ");
        }
    }
}
