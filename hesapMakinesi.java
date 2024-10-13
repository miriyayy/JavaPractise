import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesi");

        Scanner scanner =new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        double n1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        double n2=scanner.nextDouble();

        // 2-char operator
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nBir işlem seçiniz :");
        int select=scanner.nextInt();


        double sonuc = 0 ;
        switch (select){
            case 1 -> sonuc = (n1 + n2);
            case 2 -> sonuc = (n1 - n2);
            case 3 -> sonuc = (n1 * n2);
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Geçersiz işlem yaptınız!");
                } else {
                    sonuc = n1 /n2;
                }
            }

            default -> System.out.println("Hatalı seçim yaptınız.Lütfen tekrar deneyin!");
        }
        System.out.printf("Sonuç: " + ("%.2f"), sonuc);

    }
}