package lab5;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ex11 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 3, 8};

        OptionalInt max = IntStream.of(numbers).max();

        OptionalInt min = IntStream.of(numbers).min();

        System.out.println("Maximum number: " + max.getAsInt());
        System.out.println("Minimum number: " + min.getAsInt());
    }
}
