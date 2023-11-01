/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summingdigit;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SummingDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
            System.out.println("enter a number: ");
            int num=scan.nextInt();
      int sum=0;
      while(num>0){
         sum+=num%10;
         num/=10;
         
      }
        System.out.println("sum: "+ sum);
        //enter numbers in this form '123'
    }
    
}
