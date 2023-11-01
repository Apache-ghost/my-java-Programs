/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringspace;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StringSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
       
        for(int i=0;i<=str.length()-1;i++){
            System.out.println(str.charAt(i) + " ");
        }
        scan.close();
    }
    
}
