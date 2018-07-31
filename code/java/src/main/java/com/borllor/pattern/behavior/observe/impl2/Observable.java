package com.borllor.pattern.behavior.observe.impl2;

/**
 * Created by borllor on 2017/11/26.
 */
public interface Observable {
    public void register(Consumer comsumer);

    public void remove(Consumer comsumer);

    public void inform();
}
