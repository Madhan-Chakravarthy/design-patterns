package com.bikerental;

import com.bikerental.decorator.BaseBike;
import com.bikerental.decorator.accessory.BikingJacket;
import com.bikerental.decorator.accessory.Helmet;
import com.bikerental.decorator.bikevariant.BikeWith400ccEngine;

public class BikeRentalApp {
    public static void main(String args[]){
        BaseBike baseBike=new BikeWith400ccEngine();
        baseBike = new Helmet(baseBike);
        System.out.println(baseBike.cost());
        baseBike = new BikingJacket(baseBike);
        System.out.println(baseBike.cost());

    }
}
