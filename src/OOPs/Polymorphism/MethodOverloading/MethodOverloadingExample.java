package OOPs.Polymorphism.MethodOverloading;

//example of method overloading, this class is extending Addition class

//using inheritance , accessing Addition class
public class MethodOverloadingExample extends Addition {

    //main function
    public static void main(String[] args){
        //creating objects of Addition class
        Addition obj = new Addition();
        //accessing first method, & 2nd method
        obj.add(2,3);
        obj.add(2,3,4);

        //acceging 3rd method
        double result = obj.add(22.1, 6.5);
        System.out.println("addition of return type method:" + result);

    }
}
