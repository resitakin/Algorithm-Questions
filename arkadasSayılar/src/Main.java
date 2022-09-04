public class Main {

    public static void main(String[] args) {
	/*//220 sayısının bölenleri toplamı bi sayıyı veriyorsa eğer o sayınında bölenleri toplamı onu verirse arkadaş sayıdır
        int number=220;
        int number1=274;
        int sayac=0;
        int sayac1=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                sayac+=i;

            }

        }
        for (int i=1;i<number1;i++){
            if (number1%i==0){
                sayac1+=i;

            }



        }
        if (sayac==number1){
            if (sayac1==number){
                System.out.println("arkadaş sayıdır");
            }

        }else{
            System.out.println("arakdaş sayı değildir");
        }*/
        int[] sayilar={0,2,8,9,6,4,3,7};
        int aranacak=77;
        int sayar=0;
        for (int sayi:sayilar){
            if (aranacak==sayi){
                sayar++;
            }



        }
        if (sayar>0){
            System.out.println("sayi bulundu");
        }else{
            System.out.println("sayi bulunmadı");
        }
    }
}
