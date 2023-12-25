package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args){
        try {
            System.out.println("First Try Block");
            int a = 12;
            int result = a /2 ;
            try {
                System.out.println("2nd Try Block");
                String name = null;
                //System.out.println(name.length());
                try {
                    int[] array = new int[3];
                    array[5] = 6;
                }catch (IndexOutOfBoundsException e){System.out.println("IndexOutOfBoundException - end of 2nd block - end of 3rd block");}
            }catch (NullPointerException e){System.out.println("NullPointException - end of 2nd block");}
        }catch (ArithmeticException e){System.out.println("Arithmetic Exception block- end of First block");}
    }
}
