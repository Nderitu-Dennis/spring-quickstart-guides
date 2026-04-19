package sealed_interfaces_n_classes.sealed_interface;

public sealed interface Payment permits CardPayment, MpesaPayment {

    double process(double amount);
    String getPaymentType();

}
