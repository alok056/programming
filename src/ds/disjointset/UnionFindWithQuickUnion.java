package ds.disjointset;

import java.util.*;

public class UnionFindWithQuickUnion implements UnionFind {
    private final int[] parent;
    // Constructor of Union-find. The size is the length of the root array.
    public UnionFindWithQuickUnion(int size) {
        parent = new int[size];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    @Override
    public int find(int x) {
        while (x != parent[x]) {
            x = parent[x];
        }

        return x;
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
