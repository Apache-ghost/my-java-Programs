/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staircases;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Staircases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       
        System.out.println("Enter the size ");
        int size=scan.nextInt();
        
        for(int i=0;i<size;i++){
            System.out.println("*");
            
        }
        for(int i=0;i<size-2;i++){
            System.out.println("*");
            for(int j=0;j<size-2;j++){
                System.out.println(".");
            }
            System.out.println("*");
           
        }
        for (int i = 0; i < size; i++) {
            System.out.println("*"); 
    }
      

 
        
    }
    
}
