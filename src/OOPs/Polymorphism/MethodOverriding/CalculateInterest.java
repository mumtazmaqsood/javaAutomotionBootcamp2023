package OOPs.Polymorphism.MethodOverriding;
//this is main class, and inheriting Bank class method
//but other class has also their own same method, when first compilier look method in child class if it is
//avaialbe in child class then it will execute this child class method but if this method is not avaialbe in
//child class then it will execute parent class method
public class CalculateInterest {
    public static void main(String[] args){
        BankOfAmercia boa = new BankOfAmercia();
        DanskBank dk = new DanskBank();
        System.out.println("Bank of America interest rate;" + boa.getInterest());
        System.out.println("Danske bank interest rate;" + dk.getInterest());

        //accessing parent class getInterest value
        UBL ubl = new UBL();
        System.out.println("UBL interest rate;" + ubl.getInterest());

    }
}
