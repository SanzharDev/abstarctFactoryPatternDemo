package com.company.domain.furniture;

import com.company.domain.furniture.interfaces.Furniture;

public class Chair implements Furniture {

    private boolean sitOn = true;

    private boolean hasLegs = true;

    public void setSitOn(boolean sitOn) {
        this.sitOn = sitOn;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
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
