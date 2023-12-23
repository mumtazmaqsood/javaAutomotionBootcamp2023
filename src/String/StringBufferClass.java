package String;

public class StringBufferClass {
    public static void main(String[] args){
        //string is immutable --> means it cannot be modified
        String name = "Mumtaz";
        //trying to modify
        name.concat("Maqsood");
        System.out.println(name);  //output --> Mumtaz

        //declaring by stringbuffer class, it is mutable
        StringBuffer name1 = new StringBuffer("Afnan");
        name1.append("Maqsood");
        System.out.println(name1); //output -- > Afnan Maqsood

        //insert method
        name1.insert(12, " Gondal");
        System.out.println(name1); //output -- > AfnanMaqsood Gondal

        //replace method
        name1.replace(0,5, "Mumtaz ");
        System.out.println(name1); //output -- > Mumtaz Maqsood Gondal

        //delete method
        name1.delete(14,21);
        System.out.println(name1); //output -- > Mumtaz Maqsood
    }
}
