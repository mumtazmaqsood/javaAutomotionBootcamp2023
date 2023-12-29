package CollectionDemo.SetDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet <Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(100);
        lhs.add(500);
        lhs.add(200);
        lhs.add(1000);
        System.out.println(lhs);

    }
}
