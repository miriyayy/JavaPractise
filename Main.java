/*Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.*/

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int a;
        System.out.print("Sayı Giriniz:");
        a= inp.nextInt();
        int i=1;
        while(i<=a){
            i++;
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}