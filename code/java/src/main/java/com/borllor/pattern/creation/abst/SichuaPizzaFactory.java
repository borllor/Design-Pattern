package com.borllor.pattern.creation.abst;

import com.borllor.pattern.creation.abst.base.PizzaFactory;
import com.borllor.pattern.creation.abst.model.Dough;
import com.borllor.pattern.creation.abst.model.HeavySauce;
import com.borllor.pattern.creation.abst.model.Sauce;
import com.borllor.pattern.creation.abst.model.ThickDough;

/**
 * Created by borllor on 2017/11/26.
 */
public class SichuaPizzaFactory implements PizzaFactory {
    public Dough createDough() {
        return new ThickDough();
    }

    public Sauce createSauce() {
        return new HeavySauce();
    }
}
