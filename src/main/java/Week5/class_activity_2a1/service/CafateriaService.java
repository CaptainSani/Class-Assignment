package Week5.class_activity_2a1.service;

import Week5.class_activity_2a1.model.Cafateria;
import Week5.class_activity_2a1.model.DecaDevs;

public interface CafateriaService {
    public void addDevsToQueue(DecaDevs devs);


    public String collectMeal(Cafateria meal);
}
