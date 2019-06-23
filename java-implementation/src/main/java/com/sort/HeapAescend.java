package com.sort;

public class HeapAescend extends SuperSort {

    /**
     * 实现从大到小得排序
     */
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        Comparable[] heap = new Comparable[N + 1];
        for (int i = 0; i < N; i++) {
            heap[i + 1] = a[i];
        }
        for (int i = 0; i < N; i++) {
            sortHeap(heap, N - i);
            a[i] = heap[1];
            heap[1] = heap[N - i];
        }
    }

    public void sortHeap(Comparable[] heap, int max) {
        //sortSwim(heap, max);
        sortSink(heap, max);
    }

    private void sortSwim(Comparable[] a, int max) {
        for (int i = 1; i <= max; i++) {
            swim(a, i);
        }
    }

    /**
     * 上浮操作
     */
    private void swim(Comparable[] a, int index) {
        while (index > 1 && !less(a[index / 2], a[index])) {
            exch(a, index / 2, index);
            index = index / 2;
        }
    }

    private void sortSink(Comparable[] a, int max) {
        int N = max;
        for (int i = N / 2; i > 0; i--) {
            sink(a, i, N);
        }
//        while (N > 1) {
//            exch(a, 1, N--);
//            sink(a, 1, N);
//        }
    }


    /**
     * 下沉操作
     */
    private void sink(Comparable[] a, int k, int max) {
        while (k * 2 <= max) {
            int j = 2 * k;
            // 获取子节点中较大得那个
            if (j < max && !less(a[j], a[j + 1])) {
                j++;
            }
            if (!less(a[j], a[k])) {
                break;
            } else {
                exch(a, j, k);
                k = j;
            }
        }
    }
}
