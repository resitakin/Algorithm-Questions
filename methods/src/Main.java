public class Main {

    public static int topla(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static void main(String[] args) {

        System.out.println(topla(1,7,5,2,6,8));
	//birden fazla sayı gönderilip  toplama işlemi yapılacaktır
    }
}
