package com.mf.decorator.impl;

import com.mf.decorator.Coffee;
import com.mf.decorator.CoffeeDecorator;

public class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Syrup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}