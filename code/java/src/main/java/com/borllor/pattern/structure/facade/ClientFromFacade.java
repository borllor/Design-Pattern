package com.borllor.pattern.structure.facade;

/**
 * Created by borllor on 2017/11/26.
 */
public class ClientFromFacade {
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

    public void watch() {
        homeTheaterFacade.watch();
    }

    public void shutdown() {
        homeTheaterFacade.shutdown();
    }
}
