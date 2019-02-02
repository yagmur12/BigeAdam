package mantıksalOperatorler;

public class MantıksalOperatorApp {

    public static void main(String[] args) {

        /*
        --<var1>&&<var2> --> sağ ve solundaki değişken değeri true ise true değerini verir
       --<var1>||<var2> --> sağ ve solundaki değerlerden en az bir tanesi true is true değerini verir.
         --!<var1> --> değil mi operatörü verilen değişkenin tersini verir. verilen değişken true is false verir.
         False ise true verir.
         --<var1>^<var2>(XOR) işaretler birbirinden farklı olduğunda true döner sadece
        */


        boolean x=true , y=false , z=true , t=false,sonuc1,sonuc2,sonuc3,sonuc4 ,sonuc5,sonuc6;

        sonuc1=x&&z;
        sonuc2=x&&y;
        sonuc3=y||t;
        sonuc4=x||y;
        sonuc5=!x;
        sonuc6=x^y;

        System.out.println("x ve z nin and ile karşılaştırılması :"+sonuc1);
        System.out.println("x ve y nin and ile karşılaştırılması :"+sonuc2);
        System.out.println("y ve t nin veya ile karşılaştırılması :"+sonuc3);
        System.out.println("y ve t nin veya ile karşılaştırılması :"+sonuc4);
        System.out.println("x in değili :"+sonuc5);
        System.out.println("x ^^ y :"+sonuc6);




    }
}
