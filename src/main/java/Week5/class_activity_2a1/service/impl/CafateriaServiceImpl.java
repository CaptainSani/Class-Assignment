package Week5.class_activity_2a1.service.impl;

import Week5.class_activity_2a1.model.Cafateria;
import Week5.class_activity_2a1.model.DecaDevComparator;
import Week5.class_activity_2a1.model.DecaDevs;
import Week5.class_activity_2a1.service.CafateriaService;

import java.util.PriorityQueue;

public class CafateriaServiceImpl implements CafateriaService {
    PriorityQueue<DecaDevs> devsOnQueue;

    public CafateriaServiceImpl(){
        devsOnQueue = new PriorityQueue<>(new DecaDevComparator());
    }

    @Override
    public void addDevsToQueue(DecaDevs devs){
        devsOnQueue.add(devs);
    }

    @Override
    public String collectMeal(Cafateria meal){
        if(devsOnQueue.isEmpty()){
            return "No dev is on the queue";
        }
        DecaDevs devs = devsOnQueue.poll();
        return devs.getName()+ " "+"has taken"+" "+meal.getMealType();
    }
}
