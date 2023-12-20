//for, while, do while loops
public class Loops {

    //method declaration
    public static void forLoop(){
        System.out.println("For Loop");
        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("For Loop End");
    }
    public static  void whileLoop(){
        System.out.println("While Loop");
        int i = 0;
        while(i <= 10){
            System.out.print(i);
            i++;
        }

        System.out.println("while Loop end");
    }
    public static void doWhileLoop(){
        System.out.println("DoWhile Loop");
        int j = 1;
        do {
            System.out.println(j);
        }while (j < 1);
        System.out.println("End do while loop");
    }

    //main method
    public static void main(String[] args ){
        System.out.println("mian method");
        //calling methods
        forLoop();
        whileLoop();
        doWhileLoop();

    }
}
