package odev;

import java.util.Scanner;

public class AsalSayiApp {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("Klavyeden bir sayı giriniz:");
        double b=x.nextDouble();

        if(b%2==0){
            System.out.println("sayı asaldır.");
        }
        else{
            System.out.println("sayı asal değildir.");
        }
    }
}
