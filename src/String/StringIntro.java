package String;

public class StringIntro {
    public static void main(String[] args){
        //string by literal
        //if String has the same value, then in string pool there is a one value and even
        //there are 2 strings but it ll indicate to same value, it is memory efficent method
        String name = "Afnan Maqsood";
        String name1 = "Afnan Maqsood";

        //string by new keywrod
        //it is creating new obj and taking more memore
        String country = new String("Denmark");
        String country1 = new String("Denmark");

        System.out.println("Name:" + name + " Country:" + country);
        System.out.println("Name1:" + name1 + " Country1:" + country1);
    }
}
