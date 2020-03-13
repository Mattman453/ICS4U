/* Author: Matt Cruickshank
Class: ICS4U

Project: Bank Machine, Bank Account
Input: Either a name or a name and a balance for the constructor. Balances to withdraw or deposit money.
Processing: Add or remove money
Output: Gives current balances or name on the account
*/

package ics;

public class BankAccount {

    private double balance;
    private String name;

    public BankAccount(String name) {
        this(name, 0);
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }
}
