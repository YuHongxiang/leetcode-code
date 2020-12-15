package com.yhx.leetcode.editor.cn.test;

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
        print(s1);
        print(s2);
        print(s3);
    }

    public static void print(String str) {
        System.out.println("str" + "--" + Boolean.parseBoolean(str));
    }
}
