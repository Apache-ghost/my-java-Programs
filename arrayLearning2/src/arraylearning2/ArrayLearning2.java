/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayLearning2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size=scan.nextInt();
        int sum=0;
        int product=1;
        double average;
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the index at " + i);
            array[i]=scan.nextInt();
        }
        System.out.println("[ The Array is ]");
          for(int i=0;i<size;i++){
              System.out.println(array[i]);
        }
           for(int i=0;i<size;i++){
              sum+=array[i];
        }
            for(int i=0;i<size;i++){
              product*=array[i];
        }
            average=(sum)/array.length;
            System.out.println("sum: " + sum +" product: "+product +" average: "+ average);
          
        
        
    }
    
}
