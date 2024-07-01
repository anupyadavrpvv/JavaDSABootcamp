package com.anup.collections;

import java.util.*;

public class TestJavaCollection1 {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ram");
        list.add("Ajay");
        System.out.println(":::Array List:::");
        Iterator iterate = list.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        //LinkedList
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        System.out.println(":::Linked List:::");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Vector
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        System.out.println(":::Vector:::");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //Stack
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        System.out.println("Poped: "+stack.pop());
        System.out.println(":::Stack:::");
        Iterator<String> itr3=stack.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        //Priority Queue
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr4=queue.iterator();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr5=queue.iterator();
        while(itr5.hasNext()){
            System.out.println(itr5.next());
        }

        //Deque
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        System.out.println(":::Deque:::");
        for (String str : deque) {
            System.out.println(str);
        }

        //HashSet
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr6=set.iterator();
        System.out.println(":::HashSet:::");
        while(itr6.hasNext()){
            System.out.println(itr6.next());
        }

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Vijay");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Ajay");
        Iterator<String> itr7=linkedHashSet.iterator();
        System.out.println(":::LinkedHashSet:::");
        while(itr7.hasNext()){
            System.out.println(itr7.next());
        }

        //TreeSet
        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");
        Iterator<String> itr8=treeSet.iterator();
        System.out.println(":::TreeSet:::");
        while(itr8.hasNext()){
            System.out.println(itr8.next());
        }
    }
}


