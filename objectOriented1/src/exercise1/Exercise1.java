/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1;
import exercise1.Rectangle;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Rectangle r1=new Rectangle(4,4);
//        System.out.println(r1.getArea());
//        System.out.println(r1.getHeight());
//        System.out.println(r1.getWidth());
//        System.out.println(r1.getPerimeter());
       Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to enter the width and height (y/n): ");
        char choice = scan.next().charAt(0);
        int size;
        Rectangle[] rectangles;
        if (choice == 'y') {
            System.out.println("Enter the size of the width and height");
            size = scan.nextInt();
            rectangles = new Rectangle[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter the width and height: ");
                rectangles[i] = new Rectangle(scan.nextDouble(), scan.nextDouble());
            }
        } else {
            size = 1;
            rectangles = new Rectangle[size];
            rectangles[0] = new Rectangle();
        }

        System.out.println("The rectangles are: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Rectangle " + (i + 1) + ": width = " +
                    rectangles[i].getWidth() + ", height = " +
                    rectangles[i].getHeight());
        }
    }
}

