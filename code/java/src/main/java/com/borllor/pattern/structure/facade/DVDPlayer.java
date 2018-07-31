package com.borllor.pattern.structure.facade;

/**
 * Created by borllor on 2017/11/26.
 */
public class DVDPlayer {
    public void on() {
        System.out.println("打开DVD机");
    }

    public void off() {
        System.out.println("关闭DVD机");
    }

    public void insertDisk() {
        System.out.println("插入DVD碟片");
    }

    public void play() {
        System.out.println("播放");
    }

    public void pause() {
        System.out.println("暂停");
    }

    public void stop() {
        System.out.println("停止");
    }
}
