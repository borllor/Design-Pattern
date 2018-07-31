package com.borllor.pattern.creation.simple.local.factory;

import com.borllor.pattern.creation.model.Pizza;

/**
 * Created by borllor on 2017/11/26.
 */
public interface PizzaFactory {
    Pizza makePizza(String pizzaName);
}
