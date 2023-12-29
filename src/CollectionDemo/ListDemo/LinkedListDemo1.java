package CollectionDemo.ListDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("cat");
        l.add("dog");
        l.add("tiger");
        l.add("parrot");

        //adding at the start & end of the linkedlist
        l.addFirst("Fish");
        System.out.println("After Adding start of the LinkedList:" + l);
        //After Adding start of the LinkedList:[Fish, cat, dog, tiger, parrot]
        l.addLast("zebra");
        System.out.println("After Adding end of the LinkedList:" + l);
        //After Adding end of the LinkedList:[Fish, cat, dog, tiger, parrot, zebra]

        //getting first & last object
        System.out.println("Getting first element from LinkedList:" + l.getFirst());
        System.out.println("Getting last element from LinkedList:" + l.getLast());
        //Getting first element from LinkedList:Fish
        //Getting last element from LinkedList:zebra

        //removing first & last element
        l.removeFirst();
        l.removeLast();
        System.out.println("After removing first & last element;" + l);
        //After removing first & last element;[cat, dog, tiger, parrot]


    }
}
