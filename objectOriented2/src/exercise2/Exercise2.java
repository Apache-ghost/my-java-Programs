/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2;

/**
 *
 * @author Administrator
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account testAccount=new Account(1122,20000,4.5);
        if (testAccount.Withdraw(2500))
            System.out.println("withdraw succesful");
        else
            System.out.println("withdraw not succesful");
        testAccount.deposit(3000);
        System.out.println(testAccount.getId()+" "+
                testAccount.getBalance()+" "+
                testAccount.getAnnualInterestRate()+" "+
                testAccount.getDateCreated().toString());
    }
    
}
