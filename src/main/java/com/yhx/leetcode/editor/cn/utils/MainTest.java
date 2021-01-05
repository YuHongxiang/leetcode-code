package com.yhx.leetcode.editor.cn.utils;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Mythread();
        System.out.println("start");
        t.start();
        t.sleep(2000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class Mythread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (! isInterrupted()){
            n ++;
            System.out.println(n + "hello!");
        }
    }
}
