package uz.escobar.express24.repository.impl;

import uz.escobar.express24.model.product.Meal;
import uz.escobar.express24.repository.CRUDRepo;
import uz.escobar.express24.repository.MealRepo;

public class MealRepoImpl implements MealRepo, CRUDRepo<Meal, Long> {
    @Override
    public boolean save(Meal meal) {
        for (Meal meal1 : MEALS) {
            if(meal1.getID().equals(meal.getID())) {
                return false;
            }
        }
        MEALS.add(meal);
        return true;
    }

    @Override
    public boolean update(Meal meal, Long aLong) {
        return false;
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public Meal getById(Long aLong) {
        return null;
    }


}
