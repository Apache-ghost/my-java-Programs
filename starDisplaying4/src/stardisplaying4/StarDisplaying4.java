/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stardisplaying4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StarDisplaying4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner scan=new Scanner(System.in);
        
        System.out.println("enter the size of the triangle: ");
        int size =scan.nextInt();
        
        for(int i=1;i<=size;i++){
            if(i==1 || i==size)
                for(int j=1;j<=size;j++)
                    System.out.print("*");
            else
                for(int j=1;j<=size;j++)
                    if(i==1 || i==size)
                        System.out.print("*");
                    else
                        System.out.print("");
            System.out.println();
    }
    }
    
}
