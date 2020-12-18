package com.company.factory.logistics;

import com.company.domain.transport.Ship;
import com.company.domain.transport.interfaces.Transport;

public class SeaLogistics extends Logistics {

    @Override
    void planDelivery() {
        System.out.println("Delivery plan for Sea Logistics");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
