package OOPs.SuperKeywordExample;

//by using super keyword we can access class varabiles & methods, invoke constructor of immediate parent class
public class BMW extends Car{
    String name = "BMW Segement";

    //constructor
    BMW(){
        //when child class constructor is executed then automatically parent class consturctor also run
        //there is no need to use super keyword
        //super();
        System.out.println("Constructor of the BMW class");
    }

    public void getName(){
        System.out.println("accessing Child class (name) variable:" + name);
        System.out.println("accessing parent class (name) variable by super keyword:" + super.name);
    }
    public void start(){
        System.out.println("BMW is starting...");
        //accessing parent class start method by using super keyword
        super.start();
    }

    public static void main(String[] args){
        BMW obj = new BMW();
        obj.getName();
        obj.start();
    }
}
