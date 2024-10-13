import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int birthYear;
         System.out.println("Please your birth year:");
         birthYear= scanner.nextInt();
         String result = "";
         if(birthYear % 12==0){
             result="Maymun";
         } else if (birthYear%12 ==1) {
             result="Horoz";
         } else if (birthYear%12==2) {
             result="Köpek";
         } else if (birthYear%12 ==3) {
             result= "Domuz";
         }else if(birthYear%12 ==4){
             result="Fare";
         } else if (birthYear%12==5) {
             result= "Öküz";
         } else if (birthYear%12== 6) {
             result="Kaplan";
         } else if (birthYear %12==7) {
             result="Tavşan";
         } else if (birthYear%12== 8) {
             result= "Ejderha";
         } else if (birthYear%12== 9) {
             result="Yılan";
         } else if (birthYear%12== 10) {
             result="At";
         } else if (birthYear%12==11) {
             result="Koyun";
         } else {
             System.out.println("Wrong Choice!");
         }
         System.out.println(result);
    }
}