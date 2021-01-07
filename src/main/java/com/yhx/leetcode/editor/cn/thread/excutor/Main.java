package com.yhx.leetcode.editor.cn.thread.excutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // åˆ›å»ºä¸€ä¸ªå›ºå®šå¤§å°�çš„çº¿ç¨‹æ± :
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        // å…³é—­çº¿ç¨‹æ± :拒绝
        es.shutdown();
    }
}

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
