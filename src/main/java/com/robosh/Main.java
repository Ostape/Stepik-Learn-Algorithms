package com.robosh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int m = scanner.nextInt();

        try {
            List<Integer> pizanoSequence = Task3.getPizanoSequence(m);
            System.out.println(pizanoSequence);
            int position = (int) (n % pizanoSequence.size());
            System.out.println(pizanoSequence.get(position));
        }catch (RuntimeException e){
            System.out.println(n %m);
        }

    }

}
