import java.util.Scanner;

public class HavaSicakligiOneri {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int heat = 0;
             System.out.println("Lütfen sıcaklık giriniz:");
          heat= inp.nextInt();

          if(heat<5){
              System.out.println("Kayak yapabilirsiniz.");
          } else if ( heat<=25) {
          } if (heat <=15){
              System.out.println("Sinemaya gidebilirsiniz.");
        } if(heat>= 10){
              System.out.println("Pikniğe gidebilirsiniz.");
        } else{
              System.out.println("Yüzmeye gidebilirsiniz.");
        }


        System.out.println("İyi eğlenceler!");
    }
}