package com.robosh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    private static List<Integer> listOfDots = new ArrayList<>();
    private static int count = 0;
    private static int[][]arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        arr = new int[n][2];
        //read lines
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        //calculates
        while (arr.length != 0){
            removeIfIntersection();
        }


        //output
        System.out.println(count);
        for (Integer a : listOfDots){
            System.out.print(a + " ");
        }
    }

    private static void removeIfIntersection(){
        boolean flag = true;
        int value = getMinValue();
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.deepToString(arr) + " i: " + i);
//            System.out.println("value: " + value);
            if (value >= arr[i][0]) {
                if (flag) {
                    listOfDots.add(value);
                    count++;
                    flag = false;
                }
                removeElements(i);
                i--;
            }
        }
    }

    private static int getMinValue() {
        int min = arr[0][1];

        for (int i = 1; i < arr.length; i++){
            if (arr[i][1] < min) {
                min = arr[i][1];
            }
        }
        return min;
    }

    private static void removeElements(int index){
        int [][]newArr = new int[arr.length-1][2];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index){
                j--;
                continue;
            }
            newArr[j][0] = arr[i][0];
            newArr[j][1] = arr[i][1];
        }
        arr = newArr;
    }
}
