package com.yhx.leetcode.editor.cn.lambda;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addition = (a, b) -> {
            System.out.println(a + b);
        };
        addition.accept(1, 6);
    }
}
