package com.borllor.pattern.creation.simple.local.pizza;

import com.borllor.pattern.creation.model.Pizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class BeijingDurianPizza extends Pizza {
    @Override
    public String getName()
    {
        return "北京风味的榴莲披萨";
    }

    @Override
    public double getPrice()
    {
        return 80;
    }
}
