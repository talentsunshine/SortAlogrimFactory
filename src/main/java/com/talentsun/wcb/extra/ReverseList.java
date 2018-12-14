package com.talentsun.wcb.extra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseList {

    private final static Logger logger = LoggerFactory.getLogger(ReverseList.class);
    public static void main(String[] args) {
        ListNode linkedList = new ReverseList().new ListNode<String>("a");
//        ListNode1 linkedList1= new ListNode1<String>("a");
        ListNode next = linkedList.next;
        for(int i = 0;i<8;i++){

            ListNode node  =  new ReverseList().new ListNode<String>("b");
            next = node;
            next = next.next;
        }

        logger.error(linkedList.toString());
//        System.out.print(linkedList.toString());

    }

   static class ListNode1<E>{
        E value;
        ListNode next;
        public ListNode1(E value){
            this.value = value;
        }
       public String toString(){
           StringBuilder list = new StringBuilder("[");
           while(next != null){
               list.append(next.value).append(",");
               next = next.next;
           }
           list.append("]");
           return list.toString();
       }

       public ListNode reverseList(ListNode node){
            Stack<ListNode> stack = new Stack();
            for(ListNode next = node.next;next != null ;next = next.next){
                stack.push(next);
            }
            ListNode listnew = null;
           for(int i = 0 ; i<stack.size();i++){
               listnew = stack.pop();
               listnew = listnew.next;
           }
           return listnew;
       }


    }

     class ListNode<E> {
         E value;
         ListNode next;

         public ListNode(E value) {
             this.value = value;
         }

         public String toString() {
             StringBuilder list = new StringBuilder("[");
             while (next != null) {
                 list.append(next.value).append(",");
                 next = next.next;
             }
             list.append("]");
             return list.toString();
         }

     }

}
