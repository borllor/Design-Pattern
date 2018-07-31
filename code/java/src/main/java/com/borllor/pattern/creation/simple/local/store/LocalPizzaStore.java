package com.borllor.pattern.creation.simple.local.store;

import com.borllor.pattern.creation.model.Pizza;
import com.borllor.pattern.creation.simple.SimplePizzaFactory;
import com.borllor.pattern.creation.simple.local.factory.PizzaFactory;

/**
 * Created by borllor on 2017/11/26.
 */
public class LocalPizzaStore {
    PizzaFactory pizzaFactory;

    //可通过IOC注入
    public LocalPizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String pizzaName) {
        Pizza pizza = pizzaFactory.makePizza(pizzaName);
        prepare(pizza);
        bake(pizza);
        cut(pizza);
        box(pizza);

        return pizza;
    }

    private void prepare(Pizza pizza) {
        System.out.println(pizza.getName() + "饼正在准备中...");
    }

    private void bake(Pizza pizza) {
        System.out.println(pizza.getName() + "饼正在烘焙中【统一采用C厂家生产的烘焙机器】...");
    }

    private void cut(Pizza pizza) {
        System.out.println(pizza.getName() + "饼正在切片【统一切八片】...");
    }

    private void box(Pizza pizza) {
        System.out.println(pizza.getName() + "饼正在装盒，使用【统一采用C厂家的合作，红色圆形的】...");
    }
}
