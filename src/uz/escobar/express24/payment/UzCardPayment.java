package uz.escobar.express24.payment;

public class UzCardPayment extends Payment{
    protected UzCardPayment(Double amount, String clientCardNumber) {
        super(amount, clientCardNumber);
    }

    @Override
    public boolean processPayment() {
        return true;
    }
}
