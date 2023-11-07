/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      final  byte month_in_years=12;
        final byte percent=100;
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int principal=scanner.nextInt();
        System.out.println("Enter the annual insterest Rate");
        float annual_insterest=scanner.nextFloat();
        float monthlyInsterest=annual_insterest/percent/month_in_years;
    
}
