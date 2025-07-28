package week1;

import java.util.Scanner;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {

        // 2 SATIR VE 3 SÜTÜN SABİT MATRİS TANIMLANIYOR
        int[][] matrix = {
                {2, 3, 4}, // [0,0], [0,1] [0,2]
                {5, 6, 4}  // [1,0], [1,1] [2,1]
        };
        // MATRİS EKRANA YAZDIRMA KOMUT SATIRI--
        System.out.println("Matris: ");
        for (int i = 0; i < matrix.length; i++) {           // SATIR SAYISI KADAR DÖN.
            for (int j = 0; j < matrix[i].length; j++) {    // SATIRIN SÜTÜN SAYISI KADAR DÖN
                System.out.print(matrix[i][j] + "    ");    // ELEMANI YAZDIR..
            }
            System.out.println(); // BİR SATIR BİTTİĞİNDE ALT SATIRA GEÇMEYİ SAĞLAYAN KOMUT SATIRI--
        }
        // TRANSPOZE EKRANA YAZDIRMA KOMUT SATIRI--
        System.out.println("Transpoze: ");
        for (int i = 0; i < matrix[0].length; i++) {        // SÜTÜN SAYISI KADAR DÖN
            for (int j = 0; j < matrix.length; j++) {       // SATIR SAYISI KADAR DÖN
                System.out.print(matrix[j][i] + "    ");    // ELEMANI YAZDIR..
            }
            System.out.println(); // BİR SATIR BİTTİĞİNDE ALT SATIRA GEÇMEYİ SAĞLAYAN KOMUT SATIRI--
        }

    }
}
