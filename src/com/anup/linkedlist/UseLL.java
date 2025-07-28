package com.anup.linkedlist;

public class UseLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.insertAtEnd(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.search(100));
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println("Middle element "+ list.printMiddle());
        int n = 3;
        System.out.println(n+"th element from end = "+ list.printNthNodeFromEnd(n));
        //reversing the linked list
        list.reverseSinglyLinkedList();
        System.out.println("After reversing the linked list:");
        list.display();
    }
}
class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
           System.out.print(temp.value + " -> ");
           temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtEnd(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertAtFirst(val);
            return;
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }
        Node temp = head;
        int i=1;
        while(i < index  && i <= size ){
            temp = temp.next;
            i++;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
        return;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        tail = curr;
        size--;
        return tail.value;
    }

    public int search(int value){
        int pos = 1;
        Node curr = head;
        while (curr != null){
            if(curr.value == value){
                return pos;
            }else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public int printMiddle(){
        if(head == null) return -1;
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public int printNthNodeFromEnd(int n){
        if(head == null) return -1;
        Node first = head, second = head;
        while(n != 0){
            first = first.next;
            n--;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        return second.value;
    }

    public void reverseSinglyLinkedList(){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

}
