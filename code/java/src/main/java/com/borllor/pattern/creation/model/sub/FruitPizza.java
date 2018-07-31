package com.borllor.pattern.creation.model.sub;

import com.borllor.pattern.creation.model.Pizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class FruitPizza extends Pizza {
    @Override
    public String getName() {
        return "水果披萨";
    }

    @Override
    public double getPrice() {
        return 60;
    }
}
