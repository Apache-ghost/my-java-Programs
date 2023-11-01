/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise3;

/**
 *
 * @author Administrator
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        client[] clients=new client[2];
        clients[0]=new client(1112,"ali","432154621");
        clients[0].addAccount(new Account(1,1000,1.5));
        clients[0].addAccount(new Account(2,2000,2.5));
        
        clients[1]=new client(1112,"john","4325554621");
        clients[1].addAccount(new Account(3,3000,3.5));
        clients[1].addAccount(new Account(4,4000,4.5));
        clients[1].addAccount(new Account(5,5000,5.5));
        
        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());
        
        
    }   
    
}
