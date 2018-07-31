package com.borllor.pattern.creation.singleton;

/**
 * Created by borllor on 2017/11/26.
 */
/// <summary>
/// A singleton implementation may use lazy initialization,
/// where the instance is created when the static method is first invoked.
/// If the static method might be called from multiple threads simultaneously,
/// measures may need to be taken to prevent race conditions that could result \
/// in the creation of multiple instances of the class.
/// The following is a thread-safe sample implementation,
/// using lazy initialization with double-checked locking
/// </summary>
public final class Repository {
    private static volatile Repository instance = null;
    private static final Object lockObj = new Object();

    private Repository() {
    }

    //懒加载
    public static Repository getInstance() {
        //双重检查
        if (instance == null) {
            synchronized (lockObj) {
                if (instance == null) {
                    instance = new Repository();
                }
            }
        }
        return instance;
    }
}