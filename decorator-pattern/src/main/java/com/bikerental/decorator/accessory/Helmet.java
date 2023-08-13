package com.bikerental.decorator.accessory;

import com.bikerental.decorator.BaseBike;

public class Helmet extends DecoratorBike{

    public Helmet(BaseBike baseBike) {
        this.baseBike=baseBike;
    }

    @Override
    public Double cost() {
        return baseBike.cost()+500.2;
    }
}
