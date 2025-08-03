package week2;

import java.util.Scanner;

public class GecerliSifreKontrolu {

    // KONSOL ÇIKTILARIN RENK KODLARI && BAŞARILAR 'YEŞİL' = BAŞARISIZLAR 'KIRMIZI'--
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    /*  GEREKLİ BİLGİLER--
  Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.
  1-En az 8 karakter içermeli
  2-Space karakteri içermemeli
  3-İlk harf büyük harf olmalı,
  4-Son karakteri ? olmalı
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // KULLANICI'DAN VERİ ALMAYA YARIYAN KOMUT SATIRI--

        // ŞİFRE KURALLARI EKRANA YAZADIRILIYOR--
        System.out.println("Lütfen Aşağıdaki Kurallara Uygun Bir Şifre Girin:");
        System.out.println(); // BİR ALT SATIR'DA BOŞ SATIR OLURŞURUR--
        System.out.println("1. En az 8 Karakter içermeli");
        System.out.println("2. Space(BOŞLUK) Karakteri içermemeli");
        System.out.println("3. İlk harf büyük harf olmalı");
        System.out.println("4. Son karateri '?' içermeli\n");

        System.out.print("Şifreyi Girin: "); // KULLANICI'DAN ŞİFRE GİRMESİ İSTENİYOR--
        String password = scanner.nextLine();
        System.out.println();

        if (password.length() >= 8 &&                               // ŞİFRENİN UZUNLUĞU 8 && DAHA FAZLA MI?
                !password.contains(" ") &&                          // ŞİFRENİN İÇİNDE BOŞLUK KARAKTERİ VAR MI?
                Character.isUpperCase(password.charAt(0)) &&        // ŞİFRENİN İLK HARFİ BÜYÜK MÜ?
                password.charAt(password.length() - 1) == '?') {    // ŞİFRENİN SON KARAKTERİN'DE '?' VAR MI?

            System.out.println(ANSI_GREEN + "--Geçerli Şifre" + ANSI_RESET); // TÜM ŞARTLAR SAĞLANDIYSA && TRUE--
        } else {
            System.out.println(ANSI_RED + "--Geçersiz Şifre" + ANSI_RESET); // HERHANGİ BİR ŞART SAĞLANMADIYSA && FALSE--

            scanner.close();
        }
    }
}
