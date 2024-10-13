/* Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam
bölünen sayıların ortalamasını hesaplayan programı yazınız. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayı Griniz:");
        int a = inp.nextInt();
        int sum=0, count=0;
        for(int i=0; i<=a; i++){
            if(i%3==0&& i%4==0){
                sum +=i;
                count++;

            }
        }
        if(count>0){
            double average= (double)sum/count;
            System.out.println("Sayıların ortalaması:"+average);
        }else{
            System.out.println("Sayı bulunumadı.");
        }

    }
}
