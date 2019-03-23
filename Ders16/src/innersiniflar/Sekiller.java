package innersiniflar;

abstract class Sekiller {

public abstract  void tanim();
}

   class Kare extends Sekiller{
    private double kenar;

    public Kare (){

    }
    public Kare (double kenar){
        this.kenar=kenar;
    }

       @Override
       public void tanim() {

       }
   }