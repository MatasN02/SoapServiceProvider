package lt.eif.viko.m.nar.producingwebservice.generated_classes;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelers" type="{http://www.springframework.org/schema/web-services}traveler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trips" type="{http://www.springframework.org/schema/web-services}Trip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "id",
    "orderDate",
    "travelers",
    "trips"
})
public class Order {

    protected int id;
    protected String orderDate;
    @XmlElement(nillable = true)
    protected List<Traveler> travelers;
    @XmlElement(nillable = true)
    protected List<Trip> trips;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the travelers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the travelers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traveler }
     * 
     * 
     */
    public List<Traveler> getTravelers() {
        if (travelers == null) {
            travelers = new ArrayList<Traveler>();
        }
        return this.travelers;
    }

    public void setTravelers(List<Traveler> travelers){
        this.travelers = travelers;
    }

    /**
     * Gets the value of the trips property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trips property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrips().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trip }
     * 
     * 
     */
    public List<Trip> getTrips() {
        if (trips == null) {
            trips = new ArrayList<Trip>();
        }
        return this.trips;
    }

    public void setTrips(List<Trip> trips){
        this.trips = trips;
    }

}
