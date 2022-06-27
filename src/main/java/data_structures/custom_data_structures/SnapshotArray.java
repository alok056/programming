package main.java.data_structures.custom_data_structures;

import java.util.ArrayList;
import java.util.List;

public class SnapshotArray {
    int snapshotId;
    int size;
    List<List<Integer>> snapshot;

    public SnapshotArray (int size) {
        this.size = size;
        this.snapshotId = 0;
        this.snapshot = new ArrayList<>();

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < this.size; i++) {
            integerList.add(null);
        }

        this.snapshot.add(integerList);
    }

    public void set(int index, int value) {
        this.snapshot.get(snapshotId).set(index, value);
    }

    public int get(int snapshotId, int index) {
        return this.snapshot.get(snapshotId).get(index);
    }

    public int takeSnapshot() {
        List<Integer> oldList = this.snapshot.get(snapshotId);
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < this.size; i++) {
            newList.add(oldList.get(i));
        }

        this.snapshot.add(newList);

        return this.snapshotId++;
    }

    public void print() {
        System.out.println(this.snapshot);
    }
}

class Main {
    public static void main(String[] args) {
        SnapshotArray snapshotArray = new SnapshotArray(3);
        snapshotArray.set(0, 1);
        System.out.println(snapshotArray.get(0, 0));
        snapshotArray.takeSnapshot();
        snapshotArray.set(0, 3);
        System.out.println(snapshotArray.get(0, 0));
        System.out.println(snapshotArray.get(1, 0));
        snapshotArray.print();
    }
}
