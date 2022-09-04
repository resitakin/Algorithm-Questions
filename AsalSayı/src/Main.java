import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int number=24;
      int sayac=0;
      // sayı asalmı
        for (int i=2;i<24;i++){
            if (24%i==0){
                sayac++;



            }



        }
        if (sayac>0){
            System.out.println("asal değil");

        }
        else{

            System.out.println("sayı asaldır");
        }
    }
}
