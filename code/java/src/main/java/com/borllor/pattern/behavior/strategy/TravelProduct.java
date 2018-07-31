package com.borllor.pattern.behavior.strategy;

/**
 * Created by borllor on 2017/11/26.
 * 这样的设计，我们旅行产品就和客户的出行方式绑定在一起了
 * 可以看出客人的出行方式是整个产品中我们无法预测的，也是可变的
 * 那我们来封装变化吧，把变化的因素提取出来封装起来
 * 把不变的部分封装起来，我们也同时把变化的部分封装起来
 * 看看我们怎么做吧？
 */
public class TravelProduct {
    public void plan() {
        //旅客自行选择出行方式
        goBy();
        checkIn();
        travel();
        //旅客自行选择出行方式
        returnBy();
    }

    public void goBy() {
        TravelByTrain travelByTrain = new TravelByTrain();
        travelByTrain.take();
        System.out.println("我们坐火车去吧");
    }

    public void checkIn() {
        System.out.println("签到，入住酒店");
    }

    public void travel() {
        System.out.println("开始旅行吧");
    }

    public void returnBy() {
        TravelByFlight travelByFlight = new TravelByFlight();
        travelByFlight.take();
        System.out.println("我们坐飞机回去吧");
    }
}
