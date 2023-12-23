package String;

public class StringIntro {
    public static void main(String[] args){
        //string by literal
        //if String has the same value, then in string pool there is a one value and even
        //there are 2 strings but it ll indicate to same value, it is memory efficent method
        String name = "Afnan Maqsood";
        String name1 = "Afnan Maqsood";
        String name2 = "afnan maqsood";

        //string by new keywrod
        //it is creating new obj and taking more memore
        String country = new String("Denmark");
        String country1 = new String("Denmark");

        System.out.println("Name:" + name + " Country:" + country);
        System.out.println("Name1:" + name1 + " Country1:" + country1);

        //comparing strings
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
        //this method will ignore cases
        System.out.println(name.equalsIgnoreCase(name2));

        //concate string
        //by using + method
        String finalString = name + name1 + name2;
        System.out.println(finalString);

        System.out.println(name.concat(name1).concat(name2));

    }
}
