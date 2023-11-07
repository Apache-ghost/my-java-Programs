/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning1;

import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayLearning1 {

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
            System.out.println("enter another number(btw 1-20): ");
            size=scan.nextInt();
        }
       Point[] points=new Point[size];
       fillArrayOfPoint(points);
       printArrayOfPoint(points);
    }

    private static void fillArrayOfPoint(Point[] points) {
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<points.length;i++){
            System.out.println("enter the x and y for points"+(i+1) +":");
            points[i]=new Point(scan.nextInt(),scan.nextInt());
        }
          
    }

    private static void printArrayOfPoint(Point[] points) {
        System.out.println("The elements are: ");
        for(int i=0;i<points.length;i++)
            System.out.print("(" + points[i].x + "," +points[i].y + ")");
       
        
     
}
    }
    

