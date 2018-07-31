package com.borllor.pattern.structure.facade;

/**
 * Created by borllor on 2017/11/26.
 * 电视机
 */
public class Television {
    public void on() {
        System.out.println("打开电视机");
    }

    public void off() {
        System.out.println("关闭电视机");
    }

    public void changePort() {
        System.out.println("调换输入接口");
    }
}
