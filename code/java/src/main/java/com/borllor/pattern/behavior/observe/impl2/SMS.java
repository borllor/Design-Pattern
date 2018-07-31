package com.borllor.pattern.behavior.observe.impl2;

/**
 * Created by borllor on 2017/11/26.
 */
public class SMS implements Consumer {
    public void sendSMS() {
        System.out.println("正在发短信给客人");
    }

    public void update() {
        sendSMS();
    }
}
