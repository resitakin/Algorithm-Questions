public class Main {

    public static void main(String[] args) {
        int number = 28;
        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;

            }


        }
        if (toplam == number) {
            System.out.println("mükemmel sayidir");

        }else {
            System.out.println("mükemmel sayi değildir");
        }

    }
}
