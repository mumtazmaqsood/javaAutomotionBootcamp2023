package OOPs.Encapsulation;

import OOPs.Polymorphism.MethodOverriding.Bank;

public class DanskBank extends BankLoan {

    private double interestRate;
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

}
