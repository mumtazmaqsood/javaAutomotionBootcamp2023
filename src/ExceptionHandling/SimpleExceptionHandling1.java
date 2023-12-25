package ExceptionHandling;

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

    //More examples
    /*
    *         //handling Arithematic exception
        try {
            int a = 100;
            System.out.println(a/0);  //throw Arithematic exception
        }catch (ArithmeticException e){
            System.out.println("Entered in ArithmeticException Block");
        }
//--------------------------------------------------------------------------------------
        //handling NullPointerException
        try {
            String s = null;
            System.out.println(s.length());    //NullPointerException
        }catch (NullPointerException n){
            System.out.println("Entered in NullPointerException block");
        }
//----------------------------------------------------------------------------------------
        //handling NumberFormatException
        try {
            String s1 = "abc";
            int i = Integer.parseInt(s1);  //.NumberFormatException
            System.out.println(i);
        }catch (NumberFormatException n){
            System.out.println("Entered in NumberFormatException block");
        }

//----------------------------------------------------------------------------------------
        //handling ArrayIndexOutOfBoundsException
        try {
            int b[] = new int[5];
            b[10] = 100;                   //ArrayIndexOutOfBoundsException
            System.out.println(b[10]);
        }catch (ArrayIndexOutOfBoundsException n){
            System.out.println("Entered in ArrayIndexOutOfBoundsException block");
        }
//----------------------------------------------------------------------------------------

        //try catch & final block
        try {
            System.out.println("in try block");
        }catch (Exception e){
            System.out.println("in catch block");
        }finally {
            System.out.println("in finally block");
        }

    * */


}
