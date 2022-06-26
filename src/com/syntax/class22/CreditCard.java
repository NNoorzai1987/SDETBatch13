package com.syntax.class22;
public class CreditCard {
   /* Create a class CreditCard and define variable Balanceand interest. Create an instance method that will calculate interest based on the given balance.
     Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/
    double balance;
    double interest;
    double balance(double balance){
        this.balance=balance;
        return interest=balance*0.0150;}}
class Visa extends CreditCard{}
class AX extends CreditCard{
    double balance(double balance){
        this.balance=balance;
        return interest=balance*.05;}

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        System.out.println("Your interest rate for next 3 months is going to be  $"+creditCard.balance(3550)+" each month, IF you do not pay your Balancein fully");
        Visa visa=new Visa();
        System.out.println("So now Your interest rate for next 6 months is going to be  $"+creditCard.balance(6255)+" for each month, until you pay your Balancein fully");
        AX ax=new AX();
        System.out.println("Since you do not pay your Balancefrom last 18 months now your current interest ratefor each month is  $"+ax.balance(7545)+" until you pay your Balancein fully");
    }
}

