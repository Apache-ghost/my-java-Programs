/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private client clients;
    ArrayList<Transaction> transactions;
    public  Account(int id,double balance,double annualInterestRate,client clients){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        this.clients=clients;
        this.transactions=new ArrayList<>();
        dateCreated=new Date();
    }
        
    public boolean Withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            this.transactions.add(new Transaction('W',amount,this.balance,"withdraw "+amount));
            return true;
        }
        return false;
    }
    public void deposit(double amount){
        balance+=amount;
         this.transactions.add(new Transaction('D',amount,this.balance,"Deposit "+amount));
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @param annualInterestRate the annualInterestRate to set
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    public String toSting(){
        return this.id+""+
                this.balance+""+
                this.annualInterestRate+""+
                this.dateCreated;
    }

    /**
     * @return the clients
     */
    public client getClients() {
        return clients;
    }

    /**
     * @param clients the clients to set
     */
    public void setClients(client clients) {
        this.clients = clients;
    }
    
}
