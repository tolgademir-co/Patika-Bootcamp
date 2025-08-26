package week3;

import java.util.ArrayList;
import java.util.Collections;

public class BirBirineEnYakın2SayıyıBulma {

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
        int[] enYakınCift = enYakinSayilariBul(numbers);

        System.out.println("Birbirine en yakın iki sayı: " + enYakınCift[0] + " ve " + enYakınCift[1]);
        System.out.println("Aralarındaki fark: " + Math.abs(enYakınCift[0] - enYakınCift[1]));

    }

    /**
     * ArrayList içindeki birbirine en yakın iki sayı bulan method
     *
     * @param liste Integer ArrayList
     * @return Birbirine en yakın iki sayıyı içeren array
     */
    public static int[] enYakinSayilariBul(ArrayList<Integer> liste) {
        if (liste.size() < 2) {
            throw new IllegalArgumentException("Liste en az 2 eleman içermelidir!");
        }

        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0, sayi2 = 0;

        // Her sayıyı diğer tüm sayılarla karşılatır
        for (int i = 0; i < liste.size(); i++) {
            for (int j = i + 1; j < liste.size(); j++) {
                int fark = Math.abs(liste.get(i) - liste.get(j));

                if (fark < minFark) {
                    minFark = fark;
                    sayi1 = liste.get(i);
                    sayi2 = liste.get(j);
                }
            }
        }

        return new int[]{sayi1, sayi2};
    }

    // Altarnatif method - Daha verimli (0(n log n))
    public static int[] enYakinSayilarıBulOptimized(ArrayList<Integer> liste) {
        if (liste.size() < 2) {
            throw new IllegalArgumentException("Liste en az 2 eleman içermelidir!");
        }

        // Listeyi sıralama
        ArrayList<Integer> sortedListe = new ArrayList<>(liste);
        Collections.sort(sortedListe);

        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0, sayi2 = 0;

        // Sıralı listede ardışık elemanları kontrol et
        for (int i = 0; i < sortedListe.size() - 1; i++) {
            int fark = sortedListe.get(i + 1) - sortedListe.get(i);

            if (fark < minFark) {
                minFark = fark;
                sayi1 = sortedListe.get(i);
                sayi2 = sortedListe.get(i + 1);
            }
        }
        return new int[]{sayi1, sayi2};

    }
}
