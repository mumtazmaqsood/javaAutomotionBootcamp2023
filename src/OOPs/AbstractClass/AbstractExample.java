package OOPs.AbstractClass;

public class AbstractExample {

    //main method
    public static void main(String[] args){
        //reference of the abstract class but defining the object of the child class
        Shape c1 = new Cricle();
        Shape t1 = new Triangle();

        c1.displayShape();
        t1.displayShape();
    }
}
