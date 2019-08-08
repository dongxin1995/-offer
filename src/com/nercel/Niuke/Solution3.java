package com.nercel.Niuke;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author dongxin
 * @create 2019/8/8
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

public class Solution3 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<Integer>();
        if (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

}
