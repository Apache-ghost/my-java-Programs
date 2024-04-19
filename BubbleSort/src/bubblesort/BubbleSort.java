/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] array = { 5, 2, 8, 12, 1 };
        System.out.println("Original Array: " + Arrays.toString(array));

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
    
}

// package bubblesort;

// import java.util.Arrays;

// public class BubbleSort {

//     public static void main(String[] args) {
//         int[] array = { 5, 2, 8, 12, 1 };
//         System.out.println("Original Array: " + Arrays.toString(array));

//         boolean sorted = false;
//         while (!sorted) {
//             sorted = true;
//             for (int i = 0; i < array.length - 1; i++) {
//                 if (array[i] > array[i + 1]) {
//                     int temp = array[i];
//                     array[i] = array[i + 1];
//                     array[i + 1] = temp;
//                     sorted = false;
//                 }
//             }
//         }

//         System.out.println("Sorted Array: " + Arrays.toString(array));
//     }
// }

