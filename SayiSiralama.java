import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a, b , c;
        Scanner input= new Scanner(System.in);
        System.out.println("1. sayı:");
        a = input.nextInt();
        System.out.println("2. sayı :");
        b= input.nextInt();
        System.out.println("3. sayı:");
        c= input.nextInt();
        if((a>b)&&(a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
            } else if ((c>b)&&(c>a)){
                if (a>b){
                    System.out.println("c>a>b");
                }else{
                    System.out.println("c>b>a");
                }
            }
        }

    }
