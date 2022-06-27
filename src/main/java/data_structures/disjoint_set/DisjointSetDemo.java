package main.java.data_structures.disjoint_set;

public class DisjointSetDemo {
    public static void main(String[] args) {
        UnionFind uf = new UnionFindOptimized(8);

        uf.print();
        uf.union(0, 1);
        uf.print();
        uf.union(0, 2);
        uf.print();
        uf.union(1, 3);
        uf.print();
        uf.union(4, 5);
        uf.print();
        uf.union(4, 7);
        uf.print();
        uf.union(4, 3);

        uf.print();
        System.out.println(uf.isConnected(4, 6));
        System.out.println(uf.isConnected(4, 1));
        System.out.println(uf.isConnected(4, 3));
        System.out.println(uf.isConnected(4, 7));
    }
}
