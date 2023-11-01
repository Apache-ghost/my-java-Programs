/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkingevenoroddnumbers;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CheckingEvenOrOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    
}
