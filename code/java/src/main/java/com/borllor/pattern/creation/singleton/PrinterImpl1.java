package com.borllor.pattern.creation.singleton;

public class PrinterImpl1 implements Printer {
    /**
     * 【及时初始化】JVM在加载类时，就会初始化
     */
    public final static PrinterImpl1 Instance = new PrinterImpl1();

    private PrinterImpl1() {
        init();
    }

    private void init() {
        System.out.print("正在初始化...");
    }

    public void print(){
        System.out.println("打印文件中...");
    }
}
