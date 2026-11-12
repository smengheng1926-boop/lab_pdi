package lab5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex9 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            5, 2, 9, -1, 3, -8, 20, -50
        );


        System.out.println("===== CUBE OF NUMBERS =====");

        numbers.stream()
               .map(n -> n * n * n)
               .forEach(System.out::println);



        System.out.println("\n===== POSITIVE NUMBERS =====");

        numbers.stream()
               .filter(n -> n > 0)
               .forEach(System.out::println);



        System.out.println("\n===== SORTED NUMBERS =====");

        numbers.stream()
               .sorted()
               .forEach(System.out::println);

    }
}
