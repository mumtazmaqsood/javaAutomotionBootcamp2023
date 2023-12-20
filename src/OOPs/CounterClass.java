package OOPs;

public class CounterClass {
    int i = 0;
    static int j = 0;

    //consturctor
    public CounterClass(){
        i++;
        j++;
        System.out.println("Value of i=" + i);
        System.out.println("Value of j=" + j);
    }

    public static void main(String[] args){
        //static var can be acces by Class
        System.out.println("Static variable accessing by class=" +CounterClass.j);

        //creating objects
        CounterClass obj = new CounterClass();
        CounterClass obj1 = new CounterClass();
        CounterClass obj2 = new CounterClass();

    }

}
