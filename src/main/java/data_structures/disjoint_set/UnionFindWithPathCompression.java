package main.java.data_structures.disjoint_set;

import java.util.Arrays;

public class UnionFindWithPathCompression implements UnionFind {
    private int[] parent;
    public UnionFindWithPathCompression(int size) {
        parent = new int[size];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

    }

    @Override
    public int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    @Override
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            parent[rootY] = rootX;
        }
    }

    @Override
    public boolean isConnected(int x, int y) {

        return find(x) == find(y);
    }

    @Override
    public void print() {
        System.out.print("Parent: ");
        System.out.println(Arrays.stream(parent).boxed().toList());
    }
}
