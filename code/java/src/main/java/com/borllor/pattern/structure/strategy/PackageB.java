package com.borllor.pattern.structure.strategy;

/**
 * Created by borllor on 2017/11/26.
 */
public class PackageB extends Trip {
    @Override
    protected void doComingTransport() {
        System.out.println("The turists are comming by air ...");
    }

    @Override
    protected void playing() {
        System.out.println("The turists are gona play as following:");
        System.out.println("The first day: The turists are visiting the aquarium ...");
        System.out.println("The turists are going to mountains ...");
    }

    @Override
    protected void doReturnTransport() {
        System.out.println("The turists are going home by air ...");
    }
}
