public class Main {

    public static void main(String[] args) {
        HesapYönet yönet=new HesapYönet();
        yönet.yatırma(100);
        System.out.println(yönet.getBalance());
        yönet.cekme(100);
        System.out.println(yönet.getBalance());
        yönet.cekme(20);
        System.out.println(yönet.getBalance());
    }
}
