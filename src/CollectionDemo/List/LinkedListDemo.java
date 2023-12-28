package CollectionDemo.List;

import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){


        //LinkedList declartion
        //LinkedList ll = new LinkedList();  // can store different type of data
        //LinkedList <Integer> ll = new LinkedList<Integer>() //store only integar type of data
        //List ll = new LinkedList() //List is the parent Interface of LinkedList, we can declare this way llso.

        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30.56);
        ll.add("Mumtaz");
        ll.add("A");
        ll.add(true);
        System.out.println(ll); //printing the all data of LinkedList
        //output [10, 30.56, Mumtaz, A, true]

        //size, remove(index)
        // add(index, value), get(index), set(index, value),contains(value), isEmpty()

        //get the size of the LinkedList
        System.out.println("Size of the LinkedList:" + ll.size()); //Size of the LinkedList:5

        //remove object from the array
        ll.remove(2);
        System.out.println(ll); //[10, 30.56, A, true]

        //adding object
        ll.add(2, "Afnan Maqsood");
        System.out.println(ll); //[10, 30.56, Afnan Maqsood, A, true]

        //get specific element
        System.out.println("Get method:" + ll.get(2)); //Get method:Afnan Maqsood

        //set method
        ll.set(3, "Java");
        System.out.println(ll); //[10, 30.56, Afnan Maqsood, Java, true]

        //contains
        System.out.println("contains method:" + ll.contains("Java")); //contains method:true

        //isEmpty
        System.out.println("isEmpty method:" + ll.isEmpty()); //isEmpty method:false

        //retreving data by using for loop, foreach loop & Iterator

        //for loop
        for (int i=0; i<ll.size(); i++){
            System.out.println("LinkedList element:" + i + "=" + ll.get(i));
            /*LinkedList element:0=10
            LinkedList element:1=30.56
            LinkedList element:2=Afnan Maqsood
            LinkedList element:3=Java
            LinkedList element:4=true*/
        }

        //foreach loop
        System.out.println("foreach loop");
        for (Object e: ll) {
            System.out.println(e);
            /*foreach loop
            10
            30.56
            Afnan Maqsood
            Java
            true
            * */
        }

        //Iterator method
        System.out.println("Iterator Method");
        Iterator it = ll.iterator(); //Iterator will take all the LinkedList objects
        while(it.hasNext()){  //hasNext() method will check next element is avaibale
            System.out.println(it.next());  //Iterator will move to next element automatically

            /*Iterator Method
            10
            30.56
            Afnan Maqsood
            Java
            true
            */
        }

        //addAll(), removeAll()
        //sort, reverseOrder & shuffle is avaiable in Collections
        //convert array into LinkedList

        //addAll method
        //declare new empty LinkedList
        LinkedList alDuplicate = new LinkedList();
        alDuplicate.addAll(ll); //adding al objects into alDuplicate LinkedList
        System.out.println("Linkedlist after adding" + alDuplicate);

        //sort method
        LinkedList <String> stLinkedList = new LinkedList<String>();
        stLinkedList.add("X");
        stLinkedList.add("Y");
        stLinkedList.add("Z");
        stLinkedList.add("A");
        stLinkedList.add("B");
        stLinkedList.add("F");
        System.out.println("Before sorting" + stLinkedList);
        Collections.sort(stLinkedList);
        System.out.println("after sorting" + stLinkedList);
        /*Before sorting[X, Y, Z, A, B, F]
        after sorting[A, B, F, X, Y, Z]*/

        //reverseOrder
        Collections.sort(stLinkedList, Collections.reverseOrder());
        System.out.println("after reverseOrder" + stLinkedList);
        //after reverseOrder[Z, Y, X, F, B, A]

        //Shuffle
        Collections.shuffle(stLinkedList);
        System.out.println("shuffle method:" + stLinkedList);
        //shuffle method:[Y, B, Z, X, F, A]

        //conversting array to LinkedList
        //declaring array
        String arr[] = {"Cat", "Dog", "Apple"};
        for (String e:arr
        ) {
            System.out.print(e + " ");  //Cat Dog Apple
        }

        //converting
        LinkedList arrConvert = new LinkedList(Arrays.asList(arr));
        System.out.println("after Converting to LinkedList:" + arrConvert);
        // after Converting to LinkedList:[Cat, Dog, Apple]



    }
}
