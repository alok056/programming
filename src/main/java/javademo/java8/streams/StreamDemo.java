package javademo.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2, 6);

        List<Integer> sortedDistinct = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        long count = numbers.stream().filter(n -> n % 2 == 0).count();

        System.out.println("distinct sorted: " + sortedDistinct);
        System.out.println("sum: " + sum);
        System.out.println("even count: " + count);
        numbers.stream().filter(n -> n > 3).forEach(n -> System.out.println(">3: " + n));
    }
}
