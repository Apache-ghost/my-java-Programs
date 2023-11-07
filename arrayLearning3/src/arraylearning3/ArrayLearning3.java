 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylearning3;

/**
 *
 * @author Administrator
 */
public class ArrayLearning3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array={1,1,2,2,8,2,3,2};
       int searchElement=2;
        System.out.println(numberOccurence(array,searchElement));
    }
    public static int numberOccurence(int[] array,int searchElement){
        int occurence=0;
        for(int i=0;i<array.length;i++)
            if(searchElement==array[i])
                occurence++;
        return occurence;
    }
        
    
    
}
