package kodBloklari;

public class KodBloklariApp {
    public static void main(String[] args) {
        int a=5;
        System.out.println("Kademe1 :"+a);
        {

            a=3;
            System.out.println("Kademe2 :"+a);
            {
                int b=10;
                a=2;
                System.out.println("Kademe3 :"+"a nın değeri: "+a+""+"b nin değeri" +b);


            }

        }
    }
}
