import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Customer> customers=new ArrayList<Customer>();
        Customer akın=new Customer(1,"mehmet","akın");
       // customers.add(new Customer(1,"mehmet","akın"));
        customers.add(new Customer(2,"burak","çetin"));
        customers.add(new Customer(3,"akın","özbek"));
        customers.remove(akın);
        for (Customer i:customers){
            System.out.println(i.firstName);
        }
    }
}
