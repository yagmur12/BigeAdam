package kosulluIfadeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCaseStringApp {
    public static void main(String[] args) {
        Scanner h =new Scanner (System.in);
        System.out.println("Haftanın hangi gününü bulama istiyorsunuz");
        String haftaninGunu=h.next();

        switch(haftaninGunu){
            case "pazartesi" :
                System.out.println("hafatanın 1.günüdür");
                break;
            case "salı" :
                System.out.println("hafatanın 2.günüdür");
                break;
            case "çarşamba" :
                System.out.println("hafatanın 3.günüdür");
                break;
            case "perşembe" :
                System.out.println("hafatanın 4.günüdür");
                break;
            case "cuma" :
                System.out.println("hafatanın 5.günüdür");
                break;
            case "cumartesi" :
                System.out.println("hafatanın 6.günüdür");
                break;
            case"pazar":
                System.out.println("hafatanın 7.günüdür");
            break;
            default :
                System.out.println("Öyle bi gün yok.");





        }

    }
}
