package com.sort;

import org.junit.Test;

public class Shell extends SuperSort {
    @Override
    /**
     * shell sort 还是比较难得一种算法
     * */
    @Test
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        // h 是步长, 这里选择得是 h = h*3 +1, 当然了,还有其他得选择.
        while (h < N) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                // j >= h 得判断条件很重要,要保证 j - h >= 0,
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            h = h / 3;
        }
    }
}
