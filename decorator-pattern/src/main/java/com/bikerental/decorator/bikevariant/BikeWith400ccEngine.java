package com.bikerental.decorator.bikevariant;

import com.bikerental.decorator.BaseBike;

public class BikeWith400ccEngine extends BaseBike {
    public BikeWith400ccEngine(){
        description="Its a 400cc powerful bike";
    }

    @Override
    public Double cost() {
        return 7000.00;
    }
}
