package com.company.domain.furniture;

import com.company.domain.furniture.interfaces.Furniture;

public class Sofa implements Furniture {

    private boolean hasLegs = true;

    private boolean sitOn = true;

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public void setSitOn(boolean sitOn) {
        this.sitOn = sitOn;
    }

    @Override
    public boolean hasLegs() {
        return hasLegs;
    }

    @Override
    public boolean sitOn() {
        return sitOn;
    }
}
