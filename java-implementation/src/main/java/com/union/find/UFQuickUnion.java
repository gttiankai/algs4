package com.union.find;

import com.utils.StdIn;
import com.utils.StdOut;

public class UFQuickUnion {
    private int[] id;   // 分量 id(以触点作为索引)
    private int count;  // 分量数量

    /**
     * 以整数标识(0 ~ N-1)初始化 N 个触点
     * @param N
     */
    public UFQuickUnion(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

    }
    /**
     * p(0 ~ N-1)所在的分量的标识符
     * @param p
     * @return
     */
    public int find(int p){
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    /**
     * 在 p 和 q 之间添加一条连接
     * @param p
     * @param q
     */
    public void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) {
            return;
        }
        id[pRoot] = qRoot;
        count--;
    }


    /**
     * 如果 p 和 q 存在于同一个分量中,则返回 true
     * 否则,返回 false
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    /**
     * 连通分量的数量
     * @return
     */
    public int count() {
        return count;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UFQuickFind uf = new UFQuickFind(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) {
                continue;
            }
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }
}
