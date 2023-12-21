package OOPs.Inheritance.MethodOverloading;

//methodoverloading by arguments and by return type
public class Addition {

    //-------------------------------------------------------------------------------------
    //method overloading by arguments
    public void add(int a, int b){
        int c = a + b;
        System.out.println("Addition of two numbers:"+ c);
    }
    public void add(int a, int b, int c){
        int d = a + b + c;
        System.out.println("Addition of three numbers:"+ d);
    }
    //end method overloading by arguments
    //------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------
    //method overloading by return type
    public double add(double a, double b){
        double c = a + b;
        return c;
    }


    //END method overloading by return type
    //-------------------------------------------------------------------------------------
}
