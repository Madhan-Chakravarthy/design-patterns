package com.bikerental.decorator.bikevariant;

import com.bikerental.decorator.BaseBike;

public class BikeWith100ccEngine extends BaseBike {

    public BikeWith100ccEngine(){
        description="Its a simple 100cc bike";
    }

    @Override
    public Double cost() {
        return 5000.00;
    }

}
