package com.borllor.pattern.creation.normal;

import com.borllor.pattern.creation.model.Pizza;
import com.borllor.pattern.creation.model.sub.DurianPizza;
import com.borllor.pattern.creation.model.sub.FruitPizza;
import com.borllor.pattern.creation.model.sub.MyRibPizza;
import com.borllor.pattern.creation.model.sub.SteakPizza;

/**
 * Created by borllor on 2017/11/26.
 */
public class NormalPizzaStore {
    public Pizza OrderPizza(String pizzaName) {
        Pizza pizza = null;
        //如果新增披萨，我们还需要修改这部分代码，变化来了，我们就要封装变化，怎么做呢？
        if (pizzaName == "fruit") {
            pizza = new FruitPizza();
        } else if (pizzaName == "myrib") {
            pizza = new MyRibPizza();
        } else if (pizzaName == "steak") {
            pizza = new SteakPizza();
        } else if (pizzaName == "durian") {
            pizza = new DurianPizza();
        } else {
            throw new RuntimeException("对不起，亲，没有这种披萨。");
        }
        //违反开放封闭原则，单一职责原则

        //而这部分代码是始终不变的
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
