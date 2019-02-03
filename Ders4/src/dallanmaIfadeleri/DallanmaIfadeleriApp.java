package dallanmaIfadeleri;

public class DallanmaIfadeleriApp {
    public static void main(String[] args) {

        int i=0;

/*        for(i=0;i<5;i++){
            System.out.println(i);
            if(i==3){
                break;
            }

        }*/
/*        for(i=0;i<5;i++){
           *//* System.out.println(i);*//*
            if(i==2){
                break;
            }
            System.out.println(i);

        }*/

/*        while(i<5){
            i++;
            if(i==3)
                break;
            System.out.println(i);
        }*/
/*        while(i<5) {
            i++;
            if (i == 3)
                return;
            System.out.println(i);
        }*/
        while(i<5) {
            i++;
            if (i == 3)
                continue;
            System.out.println(i);
        }
    }
}
