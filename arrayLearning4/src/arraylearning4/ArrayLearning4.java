/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning4;

/**
 *
 * @author Administrator
 */
public class ArrayLearning4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array={1,1,2,2,8,2,3,2};
       int min=array[0];
       int max=array[0];
       for(int i=0;i<array.length;i++){
          max=(array[i]>max?array[i]:max);
          min=(array[i]<min?array[i]:min);
       }
        System.out.println("max: "+max+" min: "+min);
    }
    
}
