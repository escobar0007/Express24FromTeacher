package uz.escobar.express24.model;

import uz.escobar.express24.model.product.Product;
import uz.escobar.express24.payment.Payment;
import uz.escobar.express24.util.CredentialsUtil;

import java.math.BigDecimal;

public class Order {
    private Long id = CredentialsUtil.generateRandomId();
    private Product product;
    private Address address;
    private User client;
    private BigDecimal overallPrice;

    private Payment payment;
}
