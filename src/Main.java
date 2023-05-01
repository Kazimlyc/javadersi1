import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce,tarih,muzik;

        Scanner not = new Scanner(System.in);

        System.out.println("Matematik notunuz giriniz :");
        mat = not.nextInt();

        System.out.println("Fizik notunuz giriniz :");
        fizik = not.nextInt();

        System.out.println("Kimya notunuz giriniz :");
        kimya = not.nextInt();

        System.out.println("Türkçe notunuz giriniz :");
        turkce = not.nextInt();

        System.out.println("Tarih notunuz giriniz :");
        tarih = not.nextInt();

        System.out.println("Müzik notunuz giriniz :");
        muzik = not.nextInt();

        int toplam = (mat+ fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);

        System.out.println(sonuc > 60 ? "geçtiniz" : "kaldınız");
    }
}
