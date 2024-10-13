
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int age,tripType;
        double range;

        System.out.print("Please enter range (KM):");
        range= input.nextDouble();
        System.out.print("Please enter your age:");
        age= input.nextInt();
        System.out.print("Please enter trip type (1:one way OR 2:round trip) ");
        tripType=input.nextInt();
        if(range<=0 || age<=0|| tripType!=1 && tripType!=2){
            System.out.println("You entered wrong info");
        }
        double price= 0.10;
        double totalPrice= range*price;
        if(age<12){
            totalPrice *=0.5;
        } else if (age>=12 && age<=24){
            totalPrice *=0.9;
        }else if( age>=65){
            totalPrice *=0.7;
        }
           if (tripType==2){
            totalPrice *= 0.8;
        }
           System.out.println("Total Flight Price:"+ totalPrice+ "TL");
    }
}
