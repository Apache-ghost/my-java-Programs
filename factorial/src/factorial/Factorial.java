/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
       int factorial=1;

        System.out.println("Enter the number for which you want to evalaute the factorial:");
        int num=scan.nextInt();
        if(num<0){
            System.out.println("we can't evaluate the factorial of a negative number!");
        }else if(num==0){
            System.out.println("The factorial of 0 is 1."); 
    }else{
           
       
            for(int i=1;i<=num;i++){
               
                factorial*=i;
               

            }
        }
        // System.out.println( factorial);
                System.out.println("The factorial of "
                +num+ " is "+ factorial);

        
    }
    
}
