package com.borllor.pattern.structure.strategy;

/**
 * Created by borllor on 2017/11/26.
 */
public abstract class Trip {
    public void performTrip() {
        doComingTransport();
        playing();
        doReturnTransport();
    }

    protected abstract void doComingTransport();

    protected abstract void playing();

    protected abstract void doReturnTransport();
}
