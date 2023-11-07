/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning6;

/**
 *
 * @author Administrator
 */
public class ArrayLearning6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int array[][]={
           {1,2,34},
           {5,6,7,8},
           {9,10,11,12}
       };
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<4;j++)
                sum+=array[i][j];
            System.out.println("sum of row: " + (i+1)+" : "+sum);
        }
    }
    
}
