package com.company.domain.transport;

import com.company.domain.transport.interfaces.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by sea and oceans");
    }
}
