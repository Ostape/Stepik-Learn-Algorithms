package com.robosh;

import java.util.LinkedList;
import java.util.List;

public class Task3 {

    public static List<Integer> getPizanoSequence(int m) {
        int a = 0;
        int b = 1;

        List<Integer> pizzanoSeq = new LinkedList<>();
        pizzanoSeq.add(0);
        pizzanoSeq.add(1);

        int nextFib = 0;

        while (nextFib / m < 2) {
            nextFib = (a + b);
            a = b;
            b = nextFib;

            if (b % m == 0) {
                long nextOne = (a + b) % m;
                if (nextOne == 1) {
                    return pizzanoSeq;
                }
            }
            pizzanoSeq.add(b % m);
        }

        for (int i = pizzanoSeq.size()-1; i < 6*m; i++) {
            int next = (pizzanoSeq.get(i) + pizzanoSeq.get(i - 1)) % m;
            if (next < 0) {
                System.out.println("alert");
                try {
                    Thread.sleep(11111);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (next == 0) {
                int kk = (next + pizzanoSeq.get(i)) % m;
                if (kk == 1) {
                    return pizzanoSeq;
                }
            }
            pizzanoSeq.add(next);
        }
        throw new RuntimeException();
    }
}
