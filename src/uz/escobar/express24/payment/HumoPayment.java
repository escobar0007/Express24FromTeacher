package uz.escobar.express24.payment;

public class HumoPayment extends Payment{
    public HumoPayment(Double amount, String clientCardNumber) {
        super(amount, clientCardNumber);
    }

    @Override
    public boolean processPayment() {
        return false;
    }
}
