package OOPs;

public class ThisKeyword {

    int rollNo;
    String name;
    String className;
    /*public ThisKeyword(int r, String n, String c){
    //this is a correct of constructor variable to class varaible
        rollNo = r;
        name = n;
        className = c;
    }*/
    //here is achived same by using This keyword
    public ThisKeyword(int rollNo, String name, String className){
        this.rollNo = rollNo;  //right side rollNo is the class variable and left side is the constructor variable
        this.name = name;
        this.className = className;
    }
    public void display(){
        System.out.println("Roll Number=" + rollNo + " Name=" + name +  "Class Name=" + className);
    }

    public static void main(String[] args){
        ThisKeyword obj = new ThisKeyword(2, "Afnan", "1C");
        obj.display();
    }
}
