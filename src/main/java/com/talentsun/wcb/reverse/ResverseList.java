package com.talentsun.wcb.reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ResverseList {


    public static void main(String[] args) {
        List data = new ArrayList(){{
           add("a");
            add("ab");
            add("c");
            add("d");
            add("e");
        }};
       ListNode listNode = new ResverseList().initList(data);
        ListNode listNode1 =  new ResverseList().reverseList(listNode);
        System.out.println(listNode1.toString());


    }
    class ListNode<E> {
        E value;;
        ListNode head;
        ListNode next;

        public ListNode(E value) {
            this.value = value;
            this.head = this;

        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("[");
            s.append(head.value).append(",");
            while (next != null) {
                s.append(next.value).append(",");
                next = next.next;

            }

            s.deleteCharAt(s.length()-1);
            s.append("]");
            return s.toString();
        }
    }

    public ListNode initList(List data){
        ListNode head = new ListNode(data.get(0));
        ListNode pre = head;
        for(int i=1;i<data.size();i++){
            ListNode tail = new ListNode(data.get(i));
            pre.next = tail;

            pre = tail;
        }

        return head;
    }

    public ListNode reverseList(ListNode listNode){
        Stack<ListNode> stack  = new Stack();
        ListNode pre = listNode;
        while(pre != null){
            stack.push(pre);
            pre = pre.next;


        }

        System.out.println(stack.toString());
        ListNode head = null;
        head = stack.pop();
        ListNode pren = head;
//        for(int i = 1;i<stack.size();i++){
//            pren.next = stack.pop();
//
//            pren = pren.next;
//
//
//        }

        while(pren!= null){
            pren.next = stack.pop();
            pren = pren.next;
        }


        return head;

    }
}
