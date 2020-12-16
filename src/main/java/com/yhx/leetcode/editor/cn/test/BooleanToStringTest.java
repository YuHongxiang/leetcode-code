package com.yhx.leetcode.editor.cn.test;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@code BooleanToStringTest} is a test of converting String to Boolean
 * @see com.yhx.leetcode.editor.cn.Welcome#main(String[]) welcome
 * @see <a href="www.horstmann.com/corejava.html">The Core Java home page</a>
 * @index hhh
 */
public class BooleanToStringTest {
    public static void main(String[] args) {
        String s1 = "true";
        String s2 = "false";
        String s3 = "";
        Integer i1 = 5;
        print(i1);
        i1++;
        print(i1);
        triple(i1);
        print(i1);
        Integer i2 = 5;
        if(i1 == i2) {
            System.out.printf("equals");
        } else {
            System.out.printf("not equals");
        }

    }

    public static <T> void print(T str) {
        System.out.println("--" + str.toString());
    }

    public static void triple(Integer x){
        x++;
    }

    public static void changeString(String str){
        str = "change";
    }
}
