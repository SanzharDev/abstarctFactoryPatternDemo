package com.company.factory.designs;

import com.company.domain.furniture.Chair;
import com.company.domain.furniture.interfaces.Furniture;

public class ChairDesigns extends Designs {

    @Override
    void constructionProcess() {
        System.out.println("Construction process for Chair");
    }

    @Override
    Furniture createFurniture() {
        return new Chair();
    }
}
