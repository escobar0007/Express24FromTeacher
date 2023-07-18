package uz.escobar.express24.model.product;

import uz.escobar.express24.util.CredentialsUtil;

public abstract class Product {
    private final Long ID = CredentialsUtil.generateRandomId();
    private String name;
    private Double price;
    private String composition;
    private float portion;
    private Long restaurantID;
    public Product(String name, Double price, String composition, float portion) {
        this.name = name;
        this.price = price;
        this.composition = composition;
        this.portion = portion;

    }
    public Long getID() {
        return ID;
    }

    public void setRestaurantID(Long restaurantID) {
        this.restaurantID = restaurantID;
    }

    public Long getRestaurantID() {
        return restaurantID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setPortion(float portion) {
        this.portion = portion;
    }

    public float getPortion() {
        return portion;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "\n" + name + "\t" +
                 price + "\t" +
                 composition + "\t" +
                 portion;
    }
}
