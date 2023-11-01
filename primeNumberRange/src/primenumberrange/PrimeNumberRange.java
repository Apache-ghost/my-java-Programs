/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumberrange;

/**
 *
 * @author Administrator
 */
public class PrimeNumberRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       primeNumberBetween(10,30);

       }
    public static boolean isPrime(int number){
            boolean isPrime=true;
        
            for(int i=2;i<=number/2;i++)
                if(number%i==0)
                    isPrime=false;
            return true;
    
       }
    public static void primeNumberBetween(int start,int end){
           for(int i=start;start<=end;i++)
               if(isPrime(i))
                   System.out.println(i + " ");
    }
}
    

