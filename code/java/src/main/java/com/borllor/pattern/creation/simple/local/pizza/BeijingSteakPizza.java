package com.borllor.pattern.creation.simple.local.pizza;

import com.borllor.pattern.creation.model.Pizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class BeijingSteakPizza extends Pizza {
    @Override
    public String getName() {
        return "北京风味的牛肉披萨";
    }

    @Override
    public double getPrice() {
        return 140;
    }
}
