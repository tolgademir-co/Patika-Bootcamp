package week3;

import java.util.ArrayList;
import java.util.Collections;

public class FindingTheClosestTwoNumbers {

    public static void main(String[] args) {
        System.out.println(); // Bir satır boşluk bırakır--

        // ArrayList oluşturma ve 10 benzersiz pozitif sayı ekleme--
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(7);
        numbers.add(23);
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(34);
        numbers.add(89);
        numbers.add(56);
        numbers.add(28);

        System.out.println("ArrayList içersindeki sayılar: " + numbers);

        // Birbirine en yakın iki sayıyı bulma--
        int[] closest = findClosestNumbers(numbers);

        System.out.println("Birbirine en yakın iki sayı: " + closest[0] + " ve " + closest[1]);
        System.out.println("Aralarındaki fark: " + Math.abs(closest[0] - closest[1]));

    }

    /**
     * ArrayList içindeki birbirine en yakın iki sayı bulan method
     *
     * @param list Integer ArrayList
     * @return Birbirine en yakın iki sayıyı içeren array
     */
    public static int[] findClosestNumbers(ArrayList<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("Liste en az 2 eleman içermelidir!");
        }

        int minDifference = Integer.MAX_VALUE;
        int number1 = 0, number2 = 0;

        // Her sayıyı diğer tüm sayılarla karşılatır
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int difference = Math.abs(list.get(i) - list.get(j));

                if (difference < minDifference) {
                    minDifference = difference;
                    number1 = list.get(i);
                    number2 = list.get(j);
                }
            }
        }

        return new int[]{number1, number2};
    }

    // Altarnatif method - Daha verimli (0(n log n))
    public static int[] findClosestNumbersOptimized(ArrayList<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("Liste en az 2 eleman içermelidir!");
        }

        // Listeyi sıralama
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        int minDifference = Integer.MAX_VALUE;
        int number1 = 0, number2 = 0;

        // Sıralı listede ardışık elemanları kontrol et
        for (int i = 0; i < sortedList.size() - 1; i++) {
            int difference = sortedList.get(i + 1) - sortedList.get(i);

            if (difference < minDifference) {
                minDifference = difference;
                number1 = sortedList.get(i);
                number2 = sortedList.get(i + 1);
            }
        }
        return new int[]{number1, number2};

    }
}
