/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summing_two_array;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Summing_two_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
        System.out.println("Enter the size of the two arrays: ");
        int size=scan.nextInt();
        int[] result=new int[size];
        int[] array1=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the index at "+i);
            array1[i]=scan.nextInt();
        }
     
        int[] array2=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the index at "+i);
            array2[i]=scan.nextInt();
        }
        System.out.println("[first_array]");
        for(int i=0;i<size;i++){
            System.out.println(array1[i]);
        }
         System.out.println("[second_array]");
        for(int i=0;i<size;i++){
            System.out.println(array2[i]);
        }
        System.out.println("Summing the two arrays : ");
        for(int i=0;i<size;i++){
               
            result[i]=array1[i]+array2[i];
        }
        System.out.println("The sum of the two arrays is: ");
        for(int i=0;i<size;i++){
            System.out.println(result[i]);
        }
     
    }
    
}
