package week1;

import java.util.Scanner;

public class Toplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int b = input.nextInt();

        int sonuc = a + b;
        System.out.println("Toplam: " + sonuc);

        input.close();
    }
}