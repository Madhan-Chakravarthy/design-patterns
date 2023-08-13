package com.bikerental.decorator.accessory;

import com.bikerental.decorator.BaseBike;

public class BikingJacket extends DecoratorBike{
    public BikingJacket(BaseBike baseBike){
        this.baseBike=baseBike;
    }
    @Override
    public Double cost() {
        return baseBike.cost()+700.00;
    }
}
