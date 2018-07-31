package com.borllor.pattern.behavior.observe.impl2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by borllor on 2017/11/26.
 */
public class Order implements Observable {
    List<Consumer> observerList = new ArrayList();

    public void create() {
        orderStatusChange("创单成功");
    }

    public void pay() {
        orderStatusChange("支付成功");
    }

    public void refund() {
        orderStatusChange("申请退票成功");
    }

    public void orderStatusChange(String status) {
        inform();
    }

    public void inform() {
        if (observerList != null && observerList.size() > 0) {
            for (Consumer observer : observerList) {
                observer.update();
            }
        }
    }

    public void register(Consumer comsumer) {
        observerList.add(comsumer);
    }

    public void remove(Consumer comsumer) {
        observerList.remove(comsumer);
    }
}
