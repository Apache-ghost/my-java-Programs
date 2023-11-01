/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stardisplaying;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StarDisplaying {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("enter the size of the triangle: ");
        int size =scan.nextInt();
        
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size-1;j++)
                System.out.println();
            
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
