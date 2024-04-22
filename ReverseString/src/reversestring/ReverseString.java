/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string=scan.nextLine();
          String reversedStr = "";
           for (int i = string.length() - 1; i >= 0; i--) {
            reversedStr += string.charAt(i);
             }
        System.out.println("Reversed string: " + reversedStr);
  
    }
    
}

// Or you can use the below is more shorter
//     import java.util.Scanner;

// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String string = scan.nextLine();
//         String reversedStr = new StringBuilder(string).reverse().toString();
//         System.out.println("Reversed string: " + reversedStr);
//     }
// }
//
