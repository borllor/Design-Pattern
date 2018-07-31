package com.borllor.pattern.creation.simple.local.factory;

import com.borllor.pattern.creation.model.Pizza;
import com.borllor.pattern.creation.simple.local.pizza.BeijingDurianPizza;
import com.borllor.pattern.creation.simple.local.pizza.BeijingFruitPizza;
import com.borllor.pattern.creation.simple.local.pizza.BeijingMyRibPizza;
import com.borllor.pattern.creation.simple.local.pizza.BeijingSteakPizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class BeijingPizzaFactory implements PizzaFactory {
    public Pizza makePizza(String pizzaName) {
        Pizza pizza = null;
        if ("fruit".equals(pizzaName)) {
            pizza = new BeijingFruitPizza();
        } else if ("myrib".equals(pizzaName)) {
            pizza = new BeijingMyRibPizza();
        } else if ("steak".equals(pizzaName)) {
            pizza = new BeijingSteakPizza();
        } else if ("durian".equals(pizzaName)) {
            pizza = new BeijingDurianPizza();
        } else {
            throw new RuntimeException("对不起，亲，没有这种披萨。");
        }

        return pizza;
    }
}
