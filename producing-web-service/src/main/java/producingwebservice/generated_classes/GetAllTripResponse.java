package lt.eif.viko.m.nar.producingwebservice.generated_classes;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "allTrips"
})
@XmlRootElement(name = "getAllTripResponse")
public class GetAllTripResponse {

    @XmlElement(required = true)
    protected List<Trip> allTrips;

    public List<Trip> getAllTrips(){
        if(allTrips == null){
            allTrips = new ArrayList<Trip>();
        }
        return this.allTrips;
    }
}
