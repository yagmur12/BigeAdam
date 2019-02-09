package ornekler;

public class TekSayiApp {

    public static void main(String[] args) {
        int i;
        String teksayi="";
        for(i=1;i<=100;i++){

           if(i%2==1){
               teksayi+=i+" ";

           }

        }
            System.out.println(teksayi);

    }
}
