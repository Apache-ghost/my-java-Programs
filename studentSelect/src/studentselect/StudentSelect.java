/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentselect;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class StudentSelect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     
        System.out.println("Enter the number of students: ");
        int numberStudent=scan.nextInt();
        
        String[] student=new String[numberStudent];
        int[] age =new int[numberStudent];
        
         Scanner scanName=new Scanner(System.in);
         Scanner scanAge=new Scanner(System.in);
         
         for(int i=0;i<numberStudent;i++){
             System.out.println("Enter a name: ");
             student[i]=scanName.nextLine();
             System.out.println("Enter age: ");
             age[i]=scanAge.nextInt();
         }
         for(int i=0;i<numberStudent;i++){
             if(age[i]>=15){
                 System.out.println(student[i] + " can recieve the vaccine: ");
                 System.out.println("The student is now " + age[i]);
             }
         }
         scan.close();
         scanName.close();
         scanAge.close();
    }
    
}
