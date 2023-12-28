package CollectionDemo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args){
        //ArrayList declartion
        //ArrayList al = new ArrayList();  // can store different type of data
        //ArrayList <Integer> al = new ArrayList<Integer>() //store only integar type of data
        //List al = new ArrayList() //List is the parent Interface of ArrayList, we can declare this way also.
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(30.56);
        al.add("Mumtaz");
        al.add("A");
        al.add(true);
        System.out.println(al); //printing the all data of ArrayList
        //output [10, 30.56, Mumtaz, A, true]
        //size, remove, add(index, value), get(index), set(index, value),contains(value), isEmpty()

        //get the size of the ArrayList
        System.out.println("Size of the ArrayList:" + al.size()); //Size of the ArrayList:5

        //remove object from the array
        al.remove(2);
        System.out.println(al); //[10, 30.56, A, true]

        //adding object
        al.add(2, "Afnan Maqsood");
        System.out.println(al); //[10, 30.56, Afnan Maqsood, A, true]

        //get specific element
        System.out.println("Get method:" + al.get(2)); //Get method:Afnan Maqsood

        //set method
        al.set(3, "Java");
        System.out.println(al); //[10, 30.56, Afnan Maqsood, Java, true]

        //contains
        System.out.println("contains method:" + al.contains("Java")); //contains method:true

        //isEmpty
        System.out.println("isEmpty method:" + al.isEmpty()); //isEmpty method:false

        //retreving data by using for loop, foreach loop & Iterator

        //for loop
        for (int i=0; i<al.size(); i++){
            System.out.println("ArrayList element:" + i + "=" + al.get(i));
            /*ArrayList element:0=10
            ArrayList element:1=30.56
            ArrayList element:2=Afnan Maqsood
            ArrayList element:3=Java
            ArrayList element:4=true*/
        }

        //foreach loop
        System.out.println("foreach loop");
        for (Object e: al) {
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
        Iterator it = al.iterator(); //Iterator will take all the ArrayList objects
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
        //convert array into ArrayList

        //addAll method
        //declare new empty Arraylist
        ArrayList alDuplicate = new ArrayList();
        alDuplicate.addAll(al); //adding al objects into alDuplicate ArrayList
        System.out.println("Array list after adding" + alDuplicate);

        //sort method
        ArrayList <String> stArray = new ArrayList<String>();
        stArray.add("X");
        stArray.add("Y");
        stArray.add("Z");
        stArray.add("A");
        stArray.add("B");
        stArray.add("F");
        System.out.println("Before sorting" + stArray);
        Collections.sort(stArray);
        System.out.println("after sorting" + stArray);
        /*Before sorting[X, Y, Z, A, B, F]
        after sorting[A, B, F, X, Y, Z]*/

        //reverseOrder
        Collections.sort(stArray, Collections.reverseOrder());
        System.out.println("after reverseOrder" + stArray);
        //after reverseOrder[Z, Y, X, F, B, A]

        //Shuffle
        Collections.shuffle(stArray);
        System.out.println("shuffle method:" + stArray);
        //shuffle method:[Y, B, Z, X, F, A]

        //conversting array to ArrayList
        //declaring array
        String arr[] = {"Cat", "Dog", "Apple"};
        for (String e:arr
             ) {
            System.out.print(e + " ");  //Cat Dog Apple
        }

        //converting
        ArrayList arrConvert = new ArrayList(Arrays.asList(arr));
        System.out.println("after Converting to ArrayList:" + arrConvert);
        // after Converting to ArrayList:[Cat, Dog, Apple]


    }
}
