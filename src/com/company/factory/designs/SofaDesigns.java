package com.company.factory.designs;

import com.company.domain.furniture.Sofa;
import com.company.domain.furniture.interfaces.Furniture;

public class SofaDesigns extends Designs {

    @Override
    void constructionProcess() {
        System.out.println("Construction process for Sofa");
    }

    @Override
    Furniture createFurniture() {
        return new Sofa();
    }
}
