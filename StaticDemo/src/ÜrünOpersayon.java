public class ÜrünOpersayon {
    public void add(Ürün ürün){
        if (ÜrünUyumlumu.isValid(ürün)){
            System.out.println("eklendi");

        }
        else {
            System.out.println("ürün bilgileri eksiktir!!!");
        }

    }
}
