package com.borllor.pattern.behavior.strategy;

/**
 * Created by borllor on 2017/11/26.
 */
public class TravelByBike implements TravelBy {
    public void take() {
        System.out.println("我们骑自行车去...");
    }
}
