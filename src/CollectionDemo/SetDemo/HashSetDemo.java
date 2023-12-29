package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args){

        //declaring HashSet
        //HashSet hs = new HashSet();  //default capacity is 16 & load factor 0.75
        //HashSet hs = new HashSet(100, (float) 0.90); //initial capacity is 100 & load factor0.90
        //HashSet <Integer> hs = new HashSet<Integer>(); //only integar data can be stored in HashSet

        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("welcome");
        hs.add(15.65);
        hs.add("A");
        hs.add(true);
        hs.add(null);
        hs.add("A");
        System.out.println(hs); //remove duplicates & insertion order is not preserved
        //[null, A, 15.65, 100, welcome, true]

        //remove(value), contains(value), isEmpty()
        hs.remove(true);
        System.out.println("After removing object:"+ hs); //After removing object:[null, A, 15.65, 100, welcome]

        System.out.println("contains method:"+ hs.contains(100)); //contains method:true
        System.out.println("isEmpty method:" + hs.isEmpty()); //isEmpty method:false

        //Reading HashSet data
        //By for each loop
        for (Object obj: hs
             ) {System.out.print( obj + " " );} //null A 15.65 100 welcome

        //By Iterator
        System.out.println("\n Fetching values by Iterator method");
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " "); //null A 15.65 100 welcome
        }

        //addAll(collection), removeAll(collection), union by using addAll() method
        //intersection by using retainAll(collection) --> set1.retainAll(set2)
        //difference --> set1.removeAll(set2)
        //sub-ste --> set1.containsAll(set2)

        HashSet hs1 = new HashSet();
        hs1.addAll(hs);
        hs1.add("new value");
        System.out.println("addAll method:" + hs1); //addAll method:[null, A, 15.65, 100, welcome]

        //removeAll
        hs1.removeAll(hs);
        System.out.println("removeAll method:" + hs1); //removeAll method: [new value]
    }
}
