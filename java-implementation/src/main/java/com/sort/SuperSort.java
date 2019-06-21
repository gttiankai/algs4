package com.sort;

import java.util.Comparator;

abstract class SuperSort {

    abstract void sort(Comparable[] a);

    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected boolean less(Comparator comparator, Object v, Object w) {
        return comparator.compare(v, w) < 0;
    }

    protected void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
