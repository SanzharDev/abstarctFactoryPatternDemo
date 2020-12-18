package com.company.factory.logistics;

import com.company.domain.transport.Truck;
import com.company.domain.transport.interfaces.Transport;

public class RoadLogistics extends Logistics {

    @Override
    public void planDelivery() {
        System.out.println("Delivery plan for Road Logistics");
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
