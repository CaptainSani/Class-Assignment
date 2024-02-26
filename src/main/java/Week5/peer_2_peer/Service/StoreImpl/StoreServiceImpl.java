package Week5.peer_2_peer.Service.StoreImpl;

import Week5.peer_2_peer.Service.StoreService;
import Week5.peer_2_peer.model.ComparatorA;
import Week5.peer_2_peer.model.Person;
import Week5.peer_2_peer.model.Store;

import java.util.PriorityQueue;

public class StoreServiceImpl implements StoreService {


    PriorityQueue<Person> personOnQueue;

    public StoreServiceImpl() {
        personOnQueue = new PriorityQueue<>(new ComparatorA());
    }

    @Override
    public void addPersonToQueue(Person person) {

    }

    @Override
    public String sellToCustomer(Store store) {

        if(personOnQueue.isEmpty()){
            return "no person on queue";
        }
        Person person = personOnQueue.poll();
        return person.getName() + " "+"has bought" + " ";
    }
}
