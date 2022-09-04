import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk=new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisyar");
        System.out.println(sozluk.size());
        for (String eleman:sozluk.keySet()){
            System.out.println("anahtar :"+eleman+"deger :"+sozluk.get(eleman));


        }
        sozluk.remove("book");
        System.out.println(sozluk.get("book"));

    }
}
