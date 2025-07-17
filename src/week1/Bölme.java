package week1;

import java.util.Scanner;

public class Bölme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        double a = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        double b = input.nextDouble();

        if (b != 0) {
            double sonuc = a / b;
            System.out.println("Bölüm " + sonuc);

        } else {
            System.out.println("Hata: Sıfıra bölme işlemi yapılamaz!");
        }

        input.close();

    }
}
