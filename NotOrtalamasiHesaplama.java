import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner( System.in);

        System.out.print("Matematik notunu girin");
        int matematik = scanner.nextInt();

        System.out.print("Fizik notunu girin");
        int fizik = scanner.nextInt();

        System.out.print("Müzik notunu girin");
        int müzik = scanner.nextInt();

        System.out.print("Kimya notunu girin");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe notunu girin");
        int türkçe = scanner.nextInt();

        System.out.print("Tarih notunu girin");
        int tarih = scanner.nextInt();

        int toplamNot= matematik+ fizik+ müzik+ kimya+ türkçe+ tarih;
        double ortalama = (matematik + fizik + kimya + türkçe + tarih + müzik) / 6.0;

        // Sonucu ekrana yazdır
        System.out.println("Ortalamanız: " + ortalama);

        // Sınıf geçme durumunu kontrol et ve ekrana yazdır
        System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        scanner.close();
    }
}