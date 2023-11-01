/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumbers;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the random numbers: ");
        int size=scan.nextInt();
          Random random = new Random();

        System.out.print("Random numbers: ");
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(100);
            System.out.print(randomNumber + " ");
        }
    }
    
}
