package CollectionDemo.MapDemo;

import java.util.HashMap;
import java.util.Map;

//data store in key, value format
public class HashMapDemo {

    public static void main(String[] args){
        //declaration
        //HashMap <Integer, String> hm = new HashMap<Integer, String>(); //Integar & String key values
        HashMap hm = new HashMap();

        //put(key, value), get(key), remove(key), containsKey(key),
        hm.put(101, "Mumtaz");
        hm.put(102, "Fadia");
        hm.put(103, "Zanib");
        hm.put(104, "Shahbaz");
        hm.put(105, "Afnan");
        System.out.println(hm); //{101=Mumtaz, 102=Fadia, 103=Zanib, 104=Shahbaz, 105=Afnan}

        //get
        System.out.println("get method;" + hm.get(104)); //get method;Shahbaz
        //remove
        System.out.println("remove method;" + hm.remove(104)); //remove method;Shahbaz
        System.out.println(hm);

        //containsKey(key)
        System.out.println(hm.containsKey(104)); //false
        hm.put(104, "Shahbaz");
        System.out.println(hm);

    }
}
