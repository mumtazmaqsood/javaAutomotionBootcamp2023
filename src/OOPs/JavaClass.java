package OOPs;

/**
 * Created by Ganna Alieksieienko.
 * Date:  16-11-2023.
 */
public class JavaClass {
    // object state
    int legs = 4;
    String color = "white";
    String speak = "barking";

    //behaviour
    public void speaking(){System.out.println("Dog is speaking sound :" + speak);}
    public void walking(){System.out.println("Dog is walking with" + legs + "legs");}

    public static void main(String[] args){

        //creating class objects
        JavaClass  dog = new JavaClass();
        dog.speaking();
        dog.walking();
    }

}

