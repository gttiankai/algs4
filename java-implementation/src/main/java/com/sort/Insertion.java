package com.sort;

public class Insertion extends SuperSort{
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[j-1])) {
                    exch(a, j-1, j);
                }
            }
        }
    }
}
