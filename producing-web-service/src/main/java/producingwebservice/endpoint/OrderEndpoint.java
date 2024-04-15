package lt.eif.viko.m.nar.producingwebservice.endpoint;

import lt.eif.viko.m.nar.producingwebservice.generated_classes.*;
import lt.eif.viko.m.nar.producingwebservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class OrderEndpoint {

    @Autowired
    private OrderService orderService;

    @PayloadRoot(namespace = "http://www.springframework.org/schema/web-services",
                localPart = "getOrderRequest")
    @ResponsePayload
    public GetOrderResponse getOrderRequest(@RequestPayload GetOrderRequest request){
        GetOrderResponse response = new GetOrderResponse();
        response.setOrder(orderService.getOrders(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = "http://www.springframework.org/schema/web-services",
                localPart = "getAllTripRequest")
    @ResponsePayload
    public GetAllTripResponse getAllTrips(@RequestPayload GetAllTripRequest request){
        GetAllTripResponse response = new GetAllTripResponse();
        response.getAllTrips().addAll(orderService.getAllTrips());
        return response;
    }
}
