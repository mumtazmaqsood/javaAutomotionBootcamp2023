package ArithmeticAndNullpoint_ExceptionHandling;

public class SimpleExceptionHandling1 {
    public static void main(String[] args){

        //arithmetic exceptionhanlding
        try{
            int value = 100;
            int result = value / 0;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e);  // this will show the error "java.lang.ArithmeticException: / by zero"
            System.out.println("choose another value");
            e.printStackTrace();
            // show the complete except message
            //java.lang.ArithmeticException: / by zero
            //	at ArithmeticAndNullpoint_ExceptionHandling.SimpleExceptionHandling1.main(SimpleExceptionHandling1.java:9)
        }

        //NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        }catch (Exception e) {System.out.println("String is null");}


    }
}
