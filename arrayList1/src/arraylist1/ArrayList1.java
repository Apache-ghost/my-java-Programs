/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> Integers=new ArrayList<>();
        System.out.println("enter 5 integers: ");
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int temp=scan.nextInt();
            
            if(!Integers.contains(temp))
                Integers.add(temp);
        }
        Collections.sort(Integers);
        System.out.println(Integers);
    }
    
}
