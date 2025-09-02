package week5.Lambdas;

import java.util.Arrays;
import java.util.List;

public class NumberPrecessor {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .map(n -> n * 2)         // Lambda ile sayıları iki katına çıkarma
                .forEach(System.out::println);  // Lambda ile sonuçları ekrana yazdırma

    }
}
