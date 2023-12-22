package OOPs.Encapsulation;

public class mainMethod extends DanskBank {
    public static void main(String[] args){
        DanskBank dk = new DanskBank();
        dk.setName("Mumtaz Maqsood");
        dk.setAge(10);
        dk.setAmount(1000000);
        dk.getName();
        System.out.println("Age:" + dk.getAge());
        System.out.println("loan Amount:" + dk.getAmount());

        dk.setInterestRate(10);
        System.out.println("Interest Rate:" + dk.getInterestRate());
    }
}
