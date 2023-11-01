/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("How many element do you want in the  array (max is 20): ");
        int size =scan.nextInt();
        while(size>20||size<0){
            System.out.println("invalid");
            System.out.println();
            System.out.println("enter another number: ");
            size=scan.nextInt();
        }
       int[] array=new int[size];
       fillArrayOfInteger(array);
       printArrayOfInteger(array);
    }

    private static void fillArrayOfInteger(int[] array) {
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
           array[i]=scan.nextInt();
    }

    private static void printArrayOfInteger(int[] array) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(array));
        
     
}
}
