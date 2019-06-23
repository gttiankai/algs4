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
     * 这个算法有很多微妙得地方需要注意,写起来不容易,其实不容易.
     * 需要特别得注意.
     */
    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        //FOCUS:1 j = hi + 1d 得原因是因为 a[--j]
        int j = hi + 1;
        int key = lo;
        while (i < j) {
            /**
             * FOCUS: 2
             *  两个 while 循环得条件
             * */
            while (less(a[++i], a[key]) && (i < hi));
            while (less(a[key], a[--j]) && (j > lo));
            /**
             * FOCUS:3
             *  注意这个循环退出得条件很重要, 如果没有这个退出条件,程序是有问题得.
             * */
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        /**
         * FOCUS: 4
         *  最终要记得交换 exch(a, key, j), 因为当跳出循环时, j 指向得是小于 a[key]的值,
         *  所以要交换 key 和 j;
         *  个人感觉使用 key 会好很多
         * */
        exch(a, key, j);
        return j;
    }
}
