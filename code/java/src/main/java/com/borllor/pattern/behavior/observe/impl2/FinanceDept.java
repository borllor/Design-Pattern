package com.borllor.pattern.behavior.observe.impl2;

/**
 * Created by borllor on 2017/11/26.
 */
public class FinanceDept implements Consumer {
    public void refund() {
        System.out.println("财务正在退款");
    }

    public void update() {
        refund();
    }
}

