package com.borllor.pattern.creation.singleton;

/**
 * Created by borllor on 2017/11/26.
 */
public final class Application {
    private static final Application Instance = new Application();

    private Application() {
    }

    public static Application getInstance() {
        return Instance;
    }
}
