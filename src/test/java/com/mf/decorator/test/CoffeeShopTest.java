package com.mf.decorator.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mf.decorator.Coffee;
import com.mf.decorator.impl.MilkDecorator;
import com.mf.decorator.impl.SimpleCoffee;
import com.mf.decorator.impl.SugarDecorator;
import com.mf.decorator.impl.SyrupDecorator;

public class CoffeeShopTest {
    @Test
    void testSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();

        Assertions.assertEquals("Simple Coffee", coffee.getDescription());
        Assertions.assertEquals(1.0, coffee.getCost());
    }

    @Test
    void testCoffeeWithMilk() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);

        Assertions.assertEquals("Simple Coffee, Milk", coffee.getDescription());
        Assertions.assertEquals(1.5, coffee.getCost());
    }

    @Test
    void testCoffeeWithMilkAndSugar() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        Assertions.assertEquals("Simple Coffee, Milk, Sugar", coffee.getDescription());
        Assertions.assertEquals(1.75, coffee.getCost());
    }

    @Test
    void testCoffeeWithMilkSugarAndSyrup() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new SyrupDecorator(coffee);

        Assertions.assertEquals("Simple Coffee, Milk, Sugar, Syrup", coffee.getDescription());
        Assertions.assertEquals(2.5, coffee.getCost());
    }
    
}


