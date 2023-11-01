/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpolindrome;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StringPolindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=scan.nextLine();
        boolean ispolindrome=true;
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)==str.charAt(j))
                continue;
            ispolindrome=false;
            break;
        }
        System.out.println(ispolindrome ?"polindrome":"not polindrome");
    }
    
}
