package ExceptionHandling;

public class FInallyBlock {
    public static void main(String[] args){
        try {
            int number = 10;
            int res = number / 0 ;
            System.out.println(res);
        }catch (Exception e){
            System.out.println("Inside catch block");
            e.printStackTrace();
        }finally {
            System.out.println("Inside Finally block");
        }
    }
}
