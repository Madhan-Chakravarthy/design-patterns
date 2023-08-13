package com.bikerental.decorator;

public abstract class BaseBike {
    public String description;

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
