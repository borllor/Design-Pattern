package com.borllor.pattern.creation.simple;

import com.borllor.pattern.creation.model.Pizza;
import com.borllor.pattern.creation.model.sub.DurianPizza;
import com.borllor.pattern.creation.model.sub.FruitPizza;
import com.borllor.pattern.creation.model.sub.MyRibPizza;
import com.borllor.pattern.creation.model.sub.SteakPizza;

/**
 * Created by borllor on 2017/11/26.
 * 1. 工厂处理创建对象的细节
 * 2. 工厂创建对象，可以有很多地方调用
 * 3. 可以通过继承来改变创建行为
 * 4. 使用于加盟店，每个店卖的披萨品种和口味会不一样
 */
public class SimplePizzaFactory {
    public Pizza makePizza(String pizzaName) {
        Pizza pizza = null;
        if ("fruit".equals(pizzaName)) {
            pizza = new FruitPizza();
        } else if ("myrib".equals(pizzaName)) {
            pizza = new MyRibPizza();
        } else if ("steak".equals(pizzaName)) {
            pizza = new SteakPizza();
        } else if ("durian".equals(pizzaName)) {
            pizza = new DurianPizza();
        } else {
            throw new RuntimeException("对不起，亲，没有这种披萨。");
        }

        return pizza;
    }
}
