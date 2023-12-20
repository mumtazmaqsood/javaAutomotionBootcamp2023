//local vairable --> accessible only in specific method
//class variable --> can be access anywhere in a class
public class JavaVariables {
    static int classVar = 12345;
    //local vairable example
    public static void localVariableMethod(){
        int number = 123;
        String city = "Copenhagen";
        System.out.println(number);
        System.out.println(city);
        System.out.println("Class Variable in local method:" + classVar);
    }
    public static void main(String[] args) {

        localVariableMethod();
        System.out.println("Hello world!");
        System.out.println("Class Variable: in main method" + classVar);
    }
}