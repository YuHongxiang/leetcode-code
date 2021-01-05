package com.yhx.leetcode.editor.cn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome
{
   public static void main(String[] args)
   {
      String greeting = "Welcome to Core Java!";
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)
         System.out.print("=");
      System.out.println();
      String password = "AAAAA123";
      String passwordReg = "^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)[0-9A-Za-z]+$";
      Pattern passwordPattern = Pattern.compile(passwordReg);
      Matcher passwordMatcher = passwordPattern.matcher(password);
      String[] test = new String[]{
              "12345678", "1234567a", "aaa", "AAA", "123", "1234567A", "abcdABCD", // 违规数据
              "", "abc", "012?&^", "abc&(", "&(*.", "www123   ", "www 123" // 匹配数据
      };

      for(String t : test){
         System.out.println(String.format("%s \t match %b", t, passwordPattern.matcher(t).find()));
      }
//      if (!passwordMatcher.matches()) {
//         System.out.printf("密码至少包含数字、大、小写字母中的2种，且不少于8位");
//      } else {
//         System.out.printf("OK");
//      }
   }
}
