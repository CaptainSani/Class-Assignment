package Week5.class_activity_2a1;

import Week5.class_activity_2a1.enums.MealType;
import Week5.class_activity_2a1.model.Cafateria;
import Week5.class_activity_2a1.model.DecaDevs;
import Week5.class_activity_2a1.service.impl.CafateriaServiceImpl;

public class MainClass {
    public static void main(String[] args) {
        DecaDevs male1 = new DecaDevs("Sani Dogo",false,true);
        DecaDevs female1 = new DecaDevs("Isi Nwobi",true,false);
        DecaDevs male2 = new DecaDevs("master shifu",false,true);
        DecaDevs female2 = new DecaDevs("Favor Ameh",true,false);

        CafateriaServiceImpl cafateriaService = new CafateriaServiceImpl();

        Cafateria cafateria = new Cafateria(MealType.FRIED_RICE_AND_SALD);

        cafateriaService.addDevsToQueue(male1);
        cafateriaService.addDevsToQueue(female1);
        cafateriaService.addDevsToQueue(male2);
        cafateriaService.addDevsToQueue(female2);

        System.out.println(cafateriaService.collectMeal(cafateria));
        System.out.println(cafateriaService.collectMeal(cafateria));
        System.out.println(cafateriaService.collectMeal(cafateria));
        System.out.println(cafateriaService.collectMeal(cafateria));
    }
}
