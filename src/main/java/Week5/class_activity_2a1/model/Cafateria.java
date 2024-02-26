package Week5.class_activity_2a1.model;

import Week5.class_activity_2a1.enums.MealType;

public class Cafateria {
    private MealType mealType;

    public Cafateria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
