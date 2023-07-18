package uz.escobar.express24.model.product;

import uz.escobar.express24.model.enums.FoodType;

public abstract class Food extends Product {
   private FoodType foodType;

   public Food(String name, Double price, String composition, float portion) {
      super(name, price, composition, portion);
   }

   public FoodType getFoodType() {
      return foodType;
   }

   public void setFoodType(FoodType foodType) {
      this.foodType = foodType;
   }
}
