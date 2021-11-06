package com.tinnova.soma_multiplos.core;

public class Multiplos {
    public static int getSumMultiplos3or5(int value) {
        int sum = 0;
        for (int i = 2; i < value; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
