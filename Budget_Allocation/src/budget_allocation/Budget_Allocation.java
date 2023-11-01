/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package budget_allocation;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Budget_Allocation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How much do you want to spend? ");
        Scanner scan=new Scanner(System.in);
        double total=scan.nextDouble();
        double sum=0;
        int i=0;
        ArrayList<Double> proportion=new ArrayList<Double>();
        System.out.println("Enter your proportion of various expenses! ");
        System.out.println("The system stop if cumulative proportion exceed 100%");
        do{
            System.out.println("Your proportion of expense is "
            +(i+1)+ ":"); 
            double value=scan.nextDouble();
            proportion.add(value);
            sum=proportion.get(i);
            i++;
        }while(sum<=0);
        scan.close();
        if(sum>100){
            double cumulativeSum=0.0;
            for(int j=0;j<proportion.size()-1;j++){
                cumulativeSum+=proportion.get(j);
            }
            proportion.set(proportion.size()-1,
                    100.0-cumulativeSum);
        }
        for(double value:proportion){
            double expense=value*total/100.0;
            System.out.println("your " +value+ "% equals $" +expense);
        }
    }
    
}
