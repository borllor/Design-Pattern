package com.borllor.pattern.behavior.strategy;

/**
 * Created by borllor on 2017/11/26.
 */
public class TravelByTrain implements TravelBy {
    public void take() {
        System.out.println("我们坐火车去...");
    }
}
