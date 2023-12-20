package OOPs.Inheritance;


class Car {
    public void run() {
        System.out.println("Car is running");
    }
}

class BMW extends Car {
    //Car obj = new Car();
    public void stop(){System.out.println("BMW can has breaks");}
}
public class InheritanceExample1 extends BMW {
    static String carName = "BMW";

    public static void main(String[] args){
        BMW obj = new BMW();
        System.out.println(carName);
        obj.run();
        obj.stop();
    }
}
