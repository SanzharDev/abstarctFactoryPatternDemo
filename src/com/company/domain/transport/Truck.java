package com.company.domain.transport;

import com.company.domain.transport.interfaces.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by roads");
    }
}
