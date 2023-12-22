package OOPs.Encapsulation;

//data are declared as private, other classes can access this data by using setter and getter method
public class BankLoan {
    private String name;
    private int age;
    private int amount;

    public void setName(String name){
        this.name = name;
    }
    public  void setAge(int age){
        if(age >= 18 && age <= 50) {
            this.age = age;
        }else{System.out.println("Age is not valid, age must be inbetween 18- 50 years");}

    }
    public void setAmount(int amount){
        if(amount < 10000000){this.amount = amount;}
        else{System.out.println("Amount is not valid");}
    }
    public void getName(){System.out.println("Customer Name:" + name);}
    public int getAge(){return age;}
    public int getAmount(){return amount;}
}
