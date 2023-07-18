package uz.escobar.express24.model.product;

import uz.escobar.express24.model.enums.DrinkType;

public abstract class Drink extends Product {
    private DrinkType drinkType;

    public Drink(String name, Double price, String composition, float portion) {
        super(name, price, composition, portion);
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}
