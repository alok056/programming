package ds.disjointset;

import java.util.Arrays;

public class UnionFindWithRank implements UnionFind {
    private int[] parent;
    private int[] rank;
    public UnionFindWithRank(int size) {
        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        Arrays.fill(rank, 0);
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
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
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
        System.out.print("Rank: ");
        System.out.println(Arrays.stream(rank).boxed().toList());
    }
}
