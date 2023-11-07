/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning7;

/**
 *
 * @author Administrator
 */
public class ArrayLearning7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int array[][]={
           {1,2,3,4},
           {5,6,7,8},
           {9,10,11,12}
       };
           
        for(int i=0;i<3;i++){
            int max=array[i][0];
            for(int j=1;j<4;j++)
                max=(array[i][j]>max)?array[i][j]:max;
        
            System.out.println("max of row: " + (i+1)+" : "+max);
        }
    }
    
}
