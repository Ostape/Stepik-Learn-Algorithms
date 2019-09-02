package com.robosh;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private static int[][] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfThings = scan.nextInt();
        int capacityBackpack = scan.nextInt();
        arr = new int[numberOfThings][2];
        double totalPrice = 0;

        for (int i = 0; i < numberOfThings; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        sortArrByPricePerKilo();
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (capacityBackpack == 0){
                break;
            }
            if (capacityBackpack - arr[i][1] >= 0){
                totalPrice += arr[i][0];
                capacityBackpack -= arr[i][1];
            }
            else if (capacityBackpack - arr[i][1] < 0){
                totalPrice += (arr[i][0] / (double)arr[i][1]) * capacityBackpack;
                capacityBackpack = 0;
            }

        }
        System.out.println(String.format("%.3f", totalPrice));
    }

    private static void sortArrByPricePerKilo(){
        for (int i = 0; i < arr.length; i++) {
            double max = arr[i][0] / arr[i][1];
            for (int j = i; j < arr.length;j++) {
                double currentValue = arr[j][0] / arr[j][1];
                if (currentValue > max) {
                    int tempPrice = arr[i][0];
                    int tempKilo = arr[i][1];

                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];

                    arr[j][0] = tempPrice;
                    arr[j][1] = tempKilo;

                    max = currentValue;
                }
            }
        }
    }
}
