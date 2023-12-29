package CollectionDemo.QueueDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

//all method of LinkedList under List are also appplicable here
//plus method in Queue interface,
//difference between LinkedList & PriorityQueue --> heterogenious data is allow in linkedlist & not in prioritylist
public class LinkedListDemo {
    public static void main(String[] args){

        //PriorityQueue pq = new PriorityQueue();
        LinkedList pq = new LinkedList();

        //add(),offer() methods
        //using for loop to fill value in priority queue,
        //if value is even then value added by using add method else value added by offer method
        for (int i=1; i<= 5; i++){
            if(i % 2 == 0){pq.add(i);}
            else{pq.offer(i);}
        }
        System.out.println(pq);

        //get head element --> element(), peek()
        System.out.println("get head element by element method:" + pq.element());
        //1 .... if PriortyQueue is empty then  NoSuchElementException throw
        System.out.println("get head element by peek method:" + pq.peek());
        //1 .... return null if queue is empty

        //remove head element --> remove(), poll()
        System.out.println("remove head element by remove method:" + pq.remove());
        //if PriortyQueue is empty then  NoSuchElementException throw

        System.out.println("remove head element by poll method:" + pq.poll());
        //return null if queue is empty


        //retering queue element
        //by for each loop
        for (Object obj: pq
        ) {
            System.out.println(obj);
        }

        //by Iterator
        Iterator it = pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
