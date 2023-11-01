/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

import java.util.Date;

/**
 *
 * @author Administrator
 */
class Transaction {
        private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;
    
    public Transaction(char type,double amount,double balance,String description){
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
        this.date=new Date(); 
    }
}
