package com.borllor.pattern.creation.abst.base;

import com.borllor.pattern.creation.abst.model.Dough;
import com.borllor.pattern.creation.abst.model.Sauce;

/**
 * Created by borllor on 2017/11/26.
 */
public interface PizzaFactory {
    public Dough createDough();

    public Sauce createSauce();
}
