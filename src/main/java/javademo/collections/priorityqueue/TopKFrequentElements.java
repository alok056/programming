package main.java.javademo.collections.priorityqueue;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 6, 4, 2, 12, 45, 67, 8, 4, 2, 2, 4, 5, 6, 6, 1, 4};

        System.out.println(topKFrequent(arr, 4));
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());

        map.entrySet().forEach(e -> {
            pq.add(e);

            if (pq.size() > k) {
                pq.remove();
            }
        });

        return pq.stream().map(Map.Entry::getKey).toList();
//        return pq.stream().map(Map.Entry::getValue).toList();
    }
}
