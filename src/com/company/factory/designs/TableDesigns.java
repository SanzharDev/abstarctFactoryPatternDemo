package com.company.factory.designs;

import com.company.domain.furniture.Table;
import com.company.domain.furniture.interfaces.Furniture;

public class TableDesigns extends Designs {

    @Override
    void constructionProcess() {
        System.out.println("Construction process for Table");
    }

    @Override
    Furniture createFurniture() {
        return new Table();
    }
}
