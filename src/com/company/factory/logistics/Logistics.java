package com.company.factory.logistics;

import com.company.domain.transport.interfaces.Transport;

public abstract class Logistics {

    abstract void planDelivery();

    abstract Transport createTransport();
}
