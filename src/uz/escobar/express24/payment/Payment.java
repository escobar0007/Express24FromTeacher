package uz.escobar.express24.payment;

public abstract class Payment {
    private Double amount;
    private String clientCardNumber;

    protected Payment(Double amount, String clientCardNumber) {
        this.amount = amount;
        this.clientCardNumber = clientCardNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getClientCardNumber() {
        return clientCardNumber;
    }

    public void setClientCardNumber(String clientCardNumber) {
        this.clientCardNumber = clientCardNumber;
    }

    public abstract boolean processPayment();

}
