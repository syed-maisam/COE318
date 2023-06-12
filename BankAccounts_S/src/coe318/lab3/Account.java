package coe318.lab3;

/**
 *
 * @author syedabbas
 */
public class Account {
    
    //instance variables
    private String name;
    private double balance;
    private int number;
    
    //constructor
    public Account (String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        balance = initialBalance;
    }
    
    //getter methods
    String getName(){
        return this.name;
    }
    
    double getBalance(){
        return balance;
    }
    
    int getNumber(){
        return this.number;
    }
    
    //deposit method
    boolean deposit(double amount){
        if (amount <= 0){
            return false;
        }
        else {
            balance += amount;
            return true;
        }
    }
    
    //withdraw method
    boolean withdraw(double amount){
        if ((balance - amount) >= 0 && amount > 0){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

@Override
    public String toString() {
    //DO NOT MODIFY
    return "(" + getName() + ", " + getNumber() + ", " +
    String.format("$%.2f", getBalance()) + ")";
    }
}
