public class ÜrünUyumlumu {
    public static boolean isValid(Ürün ürün){
        if (ürün.id>0 && !ürün.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
