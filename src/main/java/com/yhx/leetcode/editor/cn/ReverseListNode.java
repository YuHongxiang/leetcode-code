package com.yhx.leetcode.editor.cn;

import com.yhx.leetcode.editor.cn.bean.ListNode;

import java.util.ArrayList;

public class ReverseListNode {
    class Solution {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        public int[] reversePrint(ListNode head) {
            recur(head);
            int[] res = new int[tmp.size()];
            for(int i = 0; i < res.length; i++)
                res[i] = tmp.get(i);
            return res;
        }
        void recur(ListNode head) {
            if(head == null) return;
            recur(head.getNext());
            tmp.add(head.getVal());
        }
    }
}
