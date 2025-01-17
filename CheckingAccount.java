/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_14
 */
public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance,String name,double credit){
        super(balance, name);
        this.credit =credit;
    }
    public void setCredit(double credit){
        if (this.credit >= 0){
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        
        if ((this.balance - a) >= 0) {
            if (a > 0){
                this.balance -= a;
                System.out.println(a + " baht is withdrawn from "+ this.name + " and your credit balance is " + this.credit+".");
           }
           else if (a < 0) {
                System.out.println("Input number must be a positive integer.");
           }
           else if ((this.balance - a) < 0){
                System.out.println("Not enough money!");
           }
            
        }
        else if ((this.balance - a) < 0 && ((this.balance - a)+this.credit) >= 0){
            this.credit -= a-this.balance;
            this.balance = 0;
            
            System.out.println(a + " baht is withdrawn from "+ this.name + " and your credit balance is " + this.credit+".");
        }
        else if ((this.balance - a) < 0 && ((this.balance - a)+this.credit) < 0){
            System.out.println("Not enough money!");
        }
        
    }
    public void withdraw(String a){
        withdraw(Double.parseDouble(a));
    }
    public String toString(){
        return "The "+this.name+ " account has "+this.balance+" baht and "+this.credit+ " credits.";
    }
}