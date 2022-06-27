package main.java.javademo.utils.arrays;

import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] ages   = {2,  4,  5,  12, 3,  1,  8,  23, 78, 19};
        int[] scores = {12, 14, 15, 12, 13, 11, 18, 23, 18, 19};

        Pair[] p = new Pair[ages.length];
        for (int i = 0; i < ages.length; i++) {
            p[i] = new Pair(scores[i], ages[i]);
        }

        Arrays.sort(p, (a, b) -> (a.score == b.score) ? (a.age - b.age) : a.score - b.score);

        System.out.println(Arrays.stream(p).toList());
    }
}

class Pair {
    int score;
    int age;

    Pair(int score, int age) {
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ Age: " + this.age + ", Score: " + this.score + " }";
    }
}
