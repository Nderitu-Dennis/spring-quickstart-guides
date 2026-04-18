package sealed_interfaces_n_classes.sealed_interface;

public non-sealed class MpesaPayment implements Payment {
    // NOTE: now cz MpesaPayment is non-sealed it can be extended by
    // another class eg AirtelMoneyPayment
    @Override
    public double process(double amount) {
        return amount - 10;
    }

    @Override
    public String getPaymentType() {
        return "M-PESA";
    }
}
