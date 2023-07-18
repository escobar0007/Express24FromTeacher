package uz.escobar.express24.repository.impl;

import uz.escobar.express24.model.product.Meal;
import uz.escobar.express24.model.Restaurant;
import uz.escobar.express24.repository.CRUDRepo;
import uz.escobar.express24.repository.RestaurantRepo;
import static uz.escobar.express24.repository.impl.MealRepoImpl.*;

public class RestaurantRepoImpl implements RestaurantRepo, CRUDRepo<Restaurant, Long> {
    @Override
    public boolean save(Restaurant restaurant) {
        for(Restaurant r : RESTAURANTS) {
            if(restaurant.getID().equals(r.getID())) {
                return false;
            }
        }
        RESTAURANTS.add(restaurant);
        return true;
    }
    @Override
    public boolean update (Restaurant restaurant, Long id) {
        int index = -1;
        for (Restaurant r : RESTAURANTS) {
            if (r.getID().equals(id)) {
                index = RESTAURANTS.indexOf(r);
            } else {
                return false;
            }
        }
        RESTAURANTS.set(index, restaurant);
        return true;
    }

    @Override
    public boolean delete(Long aLong) {
        for(Restaurant r : RESTAURANTS) {
            if(r.getID().equals(aLong)) {
                RESTAURANTS.remove(r);
                return true;
            }
        }
        return false;
    }

    @Override
    public Restaurant getById(Long aLong) {
        for (Restaurant r : RESTAURANTS) {
            if (r.getID().equals(aLong)) {
                return r;
            }
        }
        return null;
    }
}
