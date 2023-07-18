package uz.escobar.express24.model;

public class Restaurant {
    private String name;
    private String address;
    private String geolocation;
    private Float rate = 0.0F;
    private Long ID;
    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public String getGeolocation() {
        return geolocation;
    }
}

