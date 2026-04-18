package sealed_interfaces_n_classes.sealed_interface;

public class AirtelMoneyPayment extends MpesaPayment{
    @Override
    public double process(double amount) {
        System.out.println("airtel is affordable!");
        return amount - 5;
    }
}
