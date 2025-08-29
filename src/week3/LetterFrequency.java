package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri alır--
        System.out.print("Bir Kelime Giriniz: ");
        String input = scanner.nextLine();

        // Harf frekansını tutucak Map--
        Map<Character, Integer> freqMap = new TreeMap<>();

        // Küçük&Büyük harfleri eşdeğer tutar--
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Sadece harfleri baz alır--
                char lower = Character.toLowerCase(c); // Harflerin Büyük&Küçük farkı kaldırır--
                freqMap.put(lower, freqMap.getOrDefault(lower, 0) + 1);
            }
        }
        // Sonucu Ekrana Yazdırır--
        System.out.println("\n === Harf Frekansları ===");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
