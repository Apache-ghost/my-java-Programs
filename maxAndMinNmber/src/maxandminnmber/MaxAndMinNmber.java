/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxandminnmber;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MaxAndMinNmber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter a number: ");
      int number=scan.nextInt();
      int max=number;
      int min=number;
      if(number>=0){
            while(true){
            System.out.println("enter another number");
             number=scan.nextInt();
             
             if(number<0)
                 break;
             if(number>max)
                 max=number;
             if(number<min)
                 min=number;
      }
    
        System.out.println("min: "+ min + " max: " + max );
      }else{
          System.out.println(number +" is invalid"); 
      }
        
                
    }
    
}
