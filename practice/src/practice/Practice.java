/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
       
     int num;
     do{
         System.out.println("Enter a number btw 1 and 10; ");
          num=scan.nextInt();
     }while(num<1 || num>10);
        System.out.println(num + " is btw 1 and 10");
        
  
        
   
        
    }

    }
    

