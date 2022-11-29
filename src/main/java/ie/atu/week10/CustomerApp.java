package ie.atu.week10;

public class CustomerApp {
    public static void main(String[] args) {
        Customer john = new Customer("john", "galway","12345678","12345",true);
        System.out.println(Customer.getAddress());
    }
}
