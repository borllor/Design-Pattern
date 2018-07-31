package com.borllor.pattern.creation.singleton;

public class PrinterImpl2 implements Printer {
    private volatile static PrinterImpl2 instance;
    private static Object lockObj = new Object();

    /**
     * 【延时初始化】线程安全
     * @return
     */
    public static PrinterImpl2 getInstance() {
        if (null == instance) {
            synchronized (lockObj) {
                if (null == instance) {
                    instance = new PrinterImpl2();
                }
            }
        }
        return instance;
    }

    private PrinterImpl2() {
        init();
    }

    private void init() {
        System.out.print("正在初始化...");
    }

    public void print() {
        System.out.println("打印文件中...");
    }
}
