package com.borllor.pattern.creation.simple.local.pizza;

import com.borllor.pattern.creation.model.Pizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class ShanghaiSteakPizza extends Pizza {
    @Override
    public String getName() {
        return "上海风味的牛肉披萨";
    }

    @Override
    public double getPrice() {
        return 140;
    }
}
