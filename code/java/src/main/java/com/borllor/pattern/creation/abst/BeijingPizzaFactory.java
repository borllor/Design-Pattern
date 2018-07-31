package com.borllor.pattern.creation.abst;

import com.borllor.pattern.creation.abst.base.PizzaFactory;
import com.borllor.pattern.creation.abst.model.Dough;
import com.borllor.pattern.creation.abst.model.LightSauce;
import com.borllor.pattern.creation.abst.model.Sauce;
import com.borllor.pattern.creation.abst.model.ThinDough;

/**
 * Created by borllor on 2017/11/26.
 */
public class BeijingPizzaFactory implements PizzaFactory {
    public Dough createDough() {
        return new ThinDough();
    }

    public Sauce createSauce() {
        return new LightSauce();
    }
}
