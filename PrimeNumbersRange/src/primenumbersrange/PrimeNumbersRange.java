/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumbersrange;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PrimeNumbersRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
        System.out.print("Enter the starting number: ");
        int start = scan.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scan.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++) {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        scan.close();
    }
    
}
