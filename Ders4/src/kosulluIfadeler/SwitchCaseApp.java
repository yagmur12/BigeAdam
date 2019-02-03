package kosulluIfadeler;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);

        System.out.print("Bir değer giriniz:");

        int ifade =x.nextInt();

        switch (ifade){
            case 1:
                System.out.println("Verilen ifade:"+ifade);
                break;
            case 2:
                System.out.println("verilen ifade:"+ifade);
                break;

            case 3:
                System.out.println("Verilen ifade:"+ifade);
                break;
            default :
                System.out.println("verilen ifadenin karşılığı yoktur");


        }
    }
}
