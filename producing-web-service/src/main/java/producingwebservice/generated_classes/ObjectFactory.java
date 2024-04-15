package lt.eif.viko.m.nar.producingwebservice.generated_classes;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.springframework.schema.web_services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.springframework.schema.web_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderRequest }
     * 
     */
    public GetOrderRequest createGetOrderRequest() {
        return new GetOrderRequest();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Traveler }
     * 
     */
    public Traveler createTraveler() {
        return new Traveler();
    }

    /**
     * Create an instance of {@link Trip }
     * 
     */
    public Trip createTrip() {
        return new Trip();
    }

}
