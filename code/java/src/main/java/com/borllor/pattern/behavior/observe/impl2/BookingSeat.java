package com.borllor.pattern.behavior.observe.impl2;

/**
 * Created by borllor on 2017/11/26.
 */
public class BookingSeat implements Consumer {
    public void cancelSeat() {
        System.out.println("定位系统正在取消位置");
    }

    public void update() {
        cancelSeat();
    }
}
