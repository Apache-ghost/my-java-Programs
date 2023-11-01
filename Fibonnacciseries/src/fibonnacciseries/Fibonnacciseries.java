/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package fibonnacciseries;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Fibonnacciseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of terms in the series: ");
        int term=scan.nextInt();
        System.out.println("Enter the first number of the series: ");
        int num1=scan.nextInt();
        System.out.println("Enter the second number of the series: ");
        int num2 =scan.nextInt();
        System.out.print("Fibonacci Series up to " + term + ": ");
        for (int i = 1; i <= term; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
    }
    

