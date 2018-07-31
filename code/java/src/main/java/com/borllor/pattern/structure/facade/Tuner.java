package com.borllor.pattern.structure.facade;

/**
 * Created by borllor on 2017/11/26.
 * 调音师
 */
public class Tuner {
    public void on() {
        System.out.println("打开音响系统");
    }

    public void off() {
        System.out.println("关闭音响系统");
    }

    public void changeVolume() {
        System.out.println("调整音量");
    }

    public void changePort() {
        System.out.println("调换输入接口");
    }
}
