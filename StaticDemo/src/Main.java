public class Main {

    public static void main(String[] args) {
        Ürün yaz=new Ürün();
        ÜrünOpersayon opersayon=new ÜrünOpersayon();
        yaz.name="";
        yaz.id=10;

        opersayon.add(yaz);

    }
}
