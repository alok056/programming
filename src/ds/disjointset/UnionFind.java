package ds.disjointset;

public interface UnionFind {
    public int find(int x);
    public void union(int x, int y);
    public boolean isConnected(int x, int y);
    public void print();
}
