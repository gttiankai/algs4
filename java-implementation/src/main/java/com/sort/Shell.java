package com.sort;

public class Shell extends SuperSort {
    @Override
    /**
     * shell sort 还是比较难得一种算法
     * */
    void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h <= N / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {

                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
