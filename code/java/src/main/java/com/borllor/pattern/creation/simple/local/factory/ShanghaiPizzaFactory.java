package com.borllor.pattern.creation.simple.local.factory;

import com.borllor.pattern.creation.model.Pizza;
import com.borllor.pattern.creation.simple.local.pizza.ShanghaiDurianPizza;
import com.borllor.pattern.creation.simple.local.pizza.ShanghaiFruitPizza;
import com.borllor.pattern.creation.simple.local.pizza.ShanghaiMyRibPizza;
import com.borllor.pattern.creation.simple.local.pizza.ShanghaiSteakPizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class ShanghaiPizzaFactory implements PizzaFactory {
    public Pizza makePizza(String pizzaName) {
        Pizza pizza = null;
        if ("fruit".equals(pizzaName)) {
            pizza = new ShanghaiFruitPizza();
        } else if ("myrib".equals(pizzaName)) {
            pizza = new ShanghaiMyRibPizza();
        } else if ("steak".equals(pizzaName)) {
            pizza = new ShanghaiSteakPizza();
        } else if ("durian".equals(pizzaName)) {
            pizza = new ShanghaiDurianPizza();
        } else {
            throw new RuntimeException("对不起，亲，没有这种披萨。");
        }

        return pizza;
    }
}
