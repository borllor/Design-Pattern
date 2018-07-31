package com.borllor.pattern.structure.facade;

/**
 * Created by borllor on 2017/11/26.
 * 这么多对象，这么操作，如果留给我们客户去调用，耦合性太高，操作也不方便，我们有没有一种办法降低
 * 耦合性并是接口更简单呢，但又不影响用户单独调整音量，暂停和播放电影等操作？
 */
public class Client {
    Television television = new Television();
    Tuner tuner = new Tuner();
    DVDPlayer dvdPlayer = new DVDPlayer();

    public void watch() {
        television.on();
        television.changePort();

        tuner.on();
        tuner.changePort();
        tuner.changeVolume();

        dvdPlayer.on();
        dvdPlayer.insertDisk();
        dvdPlayer.play();
    }

    public void shutdown() {
        television.off();
        tuner.off();
        dvdPlayer.off();
    }
}
