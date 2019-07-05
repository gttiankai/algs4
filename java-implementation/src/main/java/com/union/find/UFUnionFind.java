package com.union.find;

public class UFUnionFind {
    private int[] id;   // 父链接数组
    private int[] sz;   // 各个根节点所对应的分量的大小
    private int count;  // 连通分量的数量

    /**
     * 以整数标识(0 ~ N-1)初始化 N 个触点
     * @param N
     */
    public UFUnionFind(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
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
        // 将连通分量比较小的连接到连通分量比较大的树上
        if (sz[pRoot] < sz[qRoot]) {
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];

        }
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
}
