
package factorial;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
       int factorial=1;

        System.out.println("Enter the number for which you want to evalaute the factorial:");
        int num=scan.nextInt();
        if(num<0){
            System.out.println("we can't evaluate the factorial of a negative number!");
        }else if(num==0){
            System.out.println("The factorial of 0 is 1."); 
    }else{
           
       
            for(int i=1;i<=num;i++){
               
                factorial*=i;
               

            }
        }
        // System.out.println( factorial);
                System.out.println("The factorial of "
                +num+ " is "+ factorial);

        
    }
    
}
