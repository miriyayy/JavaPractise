import java.util.Scanner;

public class UcgendeHıpotenus {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //üçgenin kenar değişkenleri a,b
        int a, b ;
        double c;

        System.out.print("1. kenarı giriniz");
         a = scanner.nextInt();
         System.out.print("2. kenarı giriniz");
          b= scanner.nextInt();

          c= Math.sqrt((a*a)+ (b*b));
           System.out.print("Hipotenüs:"+c);
    }
}