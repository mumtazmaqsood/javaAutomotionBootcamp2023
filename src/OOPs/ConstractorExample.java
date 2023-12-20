
package OOPs;


public class ConstractorExample {
    //constructor should have a same name as class
    //it is executing when class object is created

    public ConstractorExample(){System.out.println("Constructor method is called");}

    //example of parameterized constructor
    String name;
    String city;
    public ConstractorExample(String n, String c){
        name = n;
        city = c;
    }

    public void display(){
        System.out.println("Name:" + name + "City:" + city);
    }

    public static void main(String[] args){
        ConstractorExample obj = new ConstractorExample();

        //creating parameterized constructor objects
        ConstractorExample obj1 = new ConstractorExample("Mumtaz", "Copenhagen");
        obj1.display();
    }
}
