import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo;
        double boy;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz:");
        boy= scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo= scanner.nextDouble();

        double vucutkitleindeksi= kilo/(boy*boy);
        System.out.println("Vücüt Kitle İndeksiniz:"+ vucutkitleindeksi);

        //vucut k. indeksine göre kategori
        if (vucutkitleindeksi<18.0 ){
            System.out.println("Zayıf");
        } else if (vucutkitleindeksi >= 18.5 && vucutkitleindeksi<=24.9) {
            System.out.println("Normal Ağırlıkta");
        } else if (vucutkitleindeksi >=25.0 && vucutkitleindeksi<= 29.9) {
            System.out.println("Kilolu");
        }else if (vucutkitleindeksi >=30.0 && vucutkitleindeksi <=34.9){
            System.out.println("1.derece obezite");
        }else if(vucutkitleindeksi >=35.0 && vucutkitleindeksi <=39.9){
            System.out.println("2.derece obezite");
        }else 
            System.out.println("3.derece obezite");

        scanner.close();
    }
}