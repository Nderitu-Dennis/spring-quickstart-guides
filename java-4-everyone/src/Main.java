import sealed_interfaces_n_classes.sealed_interface.AirtelMoneyPayment;

public class Main {
    public static void main(String[] args) {
        //System.out.println("hello frm main");
        AirtelMoneyPayment airtel = new AirtelMoneyPayment();
        System.out.println(airtel.process(100));
    }
}
