/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summimgevennumbers;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SummimgEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int total=0;
    for(int num=1;num<101;num++){
        
        System.out.println("enter a number: ");
        int number=scan.nextInt();
        total+=number;
        if(total>=100){
            System.out.println("Done");
            break;
        }else{
            continue;
        }
        }
    }
    
}
