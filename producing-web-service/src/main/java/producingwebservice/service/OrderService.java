package lt.eif.viko.m.nar.producingwebservice.service;

import jakarta.annotation.PostConstruct;
import lt.eif.viko.m.nar.producingwebservice.generated_classes.Order;
import lt.eif.viko.m.nar.producingwebservice.generated_classes.Traveler;
import lt.eif.viko.m.nar.producingwebservice.generated_classes.Trip;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    private static final Map<Integer, Order> orders = new HashMap<>();

    private static final List<Trip> trips = new ArrayList<>();

    @PostConstruct
    public void initialize(){

        Traveler traveler1 = new Traveler();
        traveler1.setId(1);
        traveler1.setFirstName("Jonas");
        traveler1.setLastName("Jonauskas");

        Traveler traveler2 = new Traveler();
        traveler2.setId(2);
        traveler2.setFirstName("Vilius");
        traveler2.setLastName("Grybauskas");

        Trip trip1 = new Trip();
        trip1.setId(1);
        trip1.setOrganizationName("TopTuras");
        trip1.setName("Kelione aplink Amerika");
        trip1.setLocation("Visa Amerika");
        trip1.setTripDuration("3 menesiai");
        trip1.setCost(5000);

        Order order1 = new Order();
        order1.setId(1);
        order1.setOrderDate("2023-05-23");
        order1.setTravelers(List.of(traveler1, traveler2));
        order1.setTrips(List.of(trip1));

        orders.put(order1.getId(), order1);
        trips.add(trip1);
    }

    public List<Trip> getAllTrips(){
        return trips;
    }

    public Order getOrders(Integer id){
        return orders.get(id);
    }
}
