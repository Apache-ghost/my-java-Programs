/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumberchecker;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PrimeNumberChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scan.nextInt();
             
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
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    
}

// import java.util.Scanner;

// public class PrimeNumberChecker {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int number = scan.nextInt();
             
//         boolean isPrime = number > 1;
//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
        
//         System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
//     }
// }
