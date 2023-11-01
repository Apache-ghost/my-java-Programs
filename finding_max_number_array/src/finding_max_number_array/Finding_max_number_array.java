/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finding_max_number_array;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Finding_max_number_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array ( it should be a positive integer): ");
        int size=scan.nextInt();
        int[] array=new int[size];
     
       for(int k=0;k<size;k++){
           System.out.println("Enter the element at index "+k+" :");
          array[k]=scan.nextInt();
       }
        System.out.println("The elements of the array are : ");
        for(int k=0;k<size;k++){
            System.out.println(array[k]+" \t");
        }
     
        int max_number=array[0];
        for(int x=0;x<size;x++){
           for(int y=x;y<size;y++){
                if(array[x]< array[y]){
                max_number=array[y];
            }
           }
           
        }
         System.out.println("The max number in the array is "+ max_number);
       
    }
    
}
