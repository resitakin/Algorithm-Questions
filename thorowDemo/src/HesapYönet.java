public class HesapYönet {
    private double balance;

    public void yatırma(double miktar){
        balance+=miktar;
    }
    public void cekme(double miktar){
        if (balance>=miktar){
            balance-=miktar;

        }else {
            System.out.println("hesap bakiyeniz yetersizdir");
        }
    }
    public double getBalance(){
        return balance;
    }


}
