package com.borllor.pattern.creation.method;

import com.borllor.pattern.creation.model.Pizza;

/**
 * Created by borllor on 2017/11/26.
 * 1. 我们定义好了每个店烘焙披萨的流程，以保证我们制作流程和服务质量
 * 2. 所有的工厂方法都是用来封装类的创建
 * 3. 让子类来决定创建的对象是哪一个
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String pizzaName) {
        Pizza pizza = makePizza(pizzaName);
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

    protected abstract Pizza makePizza(String pizzaName);
}
