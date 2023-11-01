 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumberchecking;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PrimeNumberChecking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       
       System.out.println("enter a number: ");
        int number=scan.nextInt();
        
        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<=number/2;i++){
                if(number%i==0)
                    isPrime=false;
                    break;
            }
        }
        System.out.println(isPrime?"prime":"not prime");
    }
    
}
