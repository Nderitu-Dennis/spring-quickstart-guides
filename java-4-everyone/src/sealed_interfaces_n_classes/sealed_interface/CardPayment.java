package sealed_interfaces_n_classes.sealed_interface;

public final class CardPayment implements Payment {
    @Override
    public double process(double amount) {
        return amount * 0.10;
    }

    @Override
    public String getPaymentType() {
        return "CARD";
    }
}
