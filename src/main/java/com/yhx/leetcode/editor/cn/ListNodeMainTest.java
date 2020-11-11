package com.yhx.leetcode.editor.cn;

import com.yhx.leetcode.editor.cn.bean.ListNode;

/**
 * 链表测试main类
 */
public class ListNodeMainTest {
    public static void main(String[] args) {
        // test
        System.out.printf("hello, world!");
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.setNext(n2);
        n2.setNext(n3);

        ReverseListNode.Solution solution = new ReverseListNode().new Solution();
        int[] n4 = solution.reversePrint(n1);
        System.out.printf("reverse ListNode" + n4.toString());
    }
}
