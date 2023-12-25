package ExceptionHandling;

public class MultiCatch {
    public static void main(String[] args){

        try {
            int no1 = 100;
            //int result = no1 / 0;
            String name = null;
            int nameLength = name.length();
            System.out.println(nameLength);
        }catch (ArithmeticException e){   //Arithmetic exception will be catched heree
            System.out.print("No cannot be divided by zero");
        }catch (NullPointerException e){
            System.out.println("NullPointException");
        }
        catch (Exception e){  //if Arithmetic exception is not there then general exception handle it
            System.out.println("General Exception");
        }


    }
}
