/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Integer> Integers=new ArrayList<>();
         Scanner scan=new Scanner(System.in);
         while(true){
             displayMenu();
             int choice=scan.nextInt();
             if(choice==1){
                 System.out.println("enter an integer: ");
                 Integers.add(scan.nextInt());
                 System.out.println("Element added");
             }
             if(choice==2){
                 System.out.println("enter the element you want to remove: ");
                 int elementToRemove=scan.nextInt();
                 if(Integers.contains(elementToRemove)){
                     Integers.remove(Integer.valueOf(elementToRemove));
                     System.out.println("Removed");
                 }else
                     System.out.println("not Found");
             }
             if(choice==3){
                 System.out.println("your list is: " + Integers);
             }
             if(choice==4){
                 System.out.println("Goodbye");
                 break;
             }
             
         }
    }
    private static void displayMenu(){
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Your choice: ");
    }
    
}
