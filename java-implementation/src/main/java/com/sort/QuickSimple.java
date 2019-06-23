package com.sort;

public class QuickSimple extends SuperSort {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        sort(a, 0, N - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        /**
         * FOCUS: 这个算法虽然简单,但是还是很有效的
         * 下面得算法有两步:
         *      1. 确定 m 得最终得位置,也就是说确定 m 得值
         *      2. 将小于a[m]得值, 放在 m 得左边,右边就自然成了大于 a[m]得值
         *
         * */
        int m = lo;
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[lo])) {
                exch(a, ++m, i);
            }
        }
        exch(a, lo, m);
        sort(a, lo, m - 1);
        sort(a, m + 1, hi);
    }

    private void sortOP(Comparable[] a, int lo, int hi) {

    }


}
