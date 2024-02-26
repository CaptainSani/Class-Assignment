package Week5.peer_2_peer.Service;

import Week5.peer_2_peer.model.Person;
import Week5.peer_2_peer.model.Store;

public interface StoreService {

    void addPersonToQueue(Person person);

    String sellToCustomer(Store store);
}
