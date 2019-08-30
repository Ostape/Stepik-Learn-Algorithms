package com.robosh;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static List<Integer> getPizanoSequance(int m) {
        List<Integer> pizanoSequance = new ArrayList<>(50);
        pizanoSequance.add(0);
        pizanoSequance.add(1 % m);


        List<Long> fibList = new ArrayList<>(100);
        fibList.add(0L);
        fibList.add(1L);


        for (int i = 0; i < m * m - 1; i++) {
            long a = fibList.get(i);
            long b = fibList.get(i + 1);
            long next = a + b;
            fibList.add(next);

            if (next%m == 0) {
                long fi = next + b;
                long fii = fi + next;
                if (fi % m == 1 && fii % m == 1) {
                    break;
                }
            }

            pizanoSequance.add((int) (next % m));
        }
        System.out.println(fibList);
        return pizanoSequance;
    }
}
