package com.sort;

import org.junit.Test;

public class Quick extends SuperSort {

    @Override
    @Test
    public void sort(Comparable[] a) {
        int N = a.length;
        sort(a, 0, N - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    /**
     * 这个算法得错误之处在于没有处理号
     */
    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        // j = hi + 1d 得原因是因为 a[--j]
        int j = hi + 1;
        int key = lo;
        while (i < j) {
            while (less(a[++i], a[key])) {
                if (i == hi) {
                    break;
                }
            }
            while (less(a[key], a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            /**
             * FOCUS: 注意这个循环退出得条件很重要, 要记住得
             * */
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
