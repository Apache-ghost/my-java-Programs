/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberoccurence;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NumberOccurence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++)
            for(int j=1;j<=i;j++)
                System.out.println(i);
        System.out.println();
   
    }
    
}
