package week1;

import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunucu (metre cinsinden) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double index = kilo / (boy * boy);
        System.out.println("Vücüt Kitle İndeksiniz: " + index);

        scanner.close();
    }
}
