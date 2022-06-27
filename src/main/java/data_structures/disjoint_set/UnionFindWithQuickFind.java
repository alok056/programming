package main.java.data_structures.disjoint_set;

import java.util.*;

public class UnionFindWithQuickFind implements UnionFind {
    private final int[] root;
    // Constructor of Union-find. The size is the length of the root array.
    public UnionFindWithQuickFind(int size) {
        root = new int[size];

        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
    }

    @Override
    public int find(int x) {
        return root[x];
    }

    @Override
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            root[rootY] = rootX;
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    @Override
    public boolean isConnected(int x, int y) {

        return find(x) == find(y);
    }

    public void print() {
        System.out.print("Root: ");
        System.out.println(Arrays.stream(root).boxed().toList());
    }
}
