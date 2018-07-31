package com.borllor.pattern.behavior.strategy;

/**
 * Created by borllor on 2017/11/26.
 */
public class TravelTrategyProduct {
    TravelBy goBy;
    TravelBy returnBy;

    public TravelTrategyProduct(TravelBy goBy, TravelBy returnBy) {
        this.goBy = goBy;
        this.returnBy = returnBy;
    }

    public void plan() {
        goBy();
        checkIn();
        travel();
        returnBy();
    }

    public void goBy() {
        goBy.take();
    }

    public void checkIn() {
        System.out.println("签到，入住酒店");
    }

    public void travel() {
        System.out.println("开始旅行吧");
    }

    public void returnBy() {
        returnBy.take();
    }
}
