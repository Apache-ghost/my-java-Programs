/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countword1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class CountWord1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner word=new Scanner(System.in);
        
        System.out.println("Enter the sting to be count: ");
        String sentence=word.nextLine();
        System.out.println("The given string is " + sentence);
        
        int total=1;
        int i=0;
        
        while(i<sentence.length()){
            if((sentence.charAt(i)==' ') && ((sentence.charAt(i+1)!=' '))){
                total++;
        }
            i++;
        }
        System.out.println("The number of words in the given string is " + total);
    }
    
}

// try this new one:
// import java.util.Scanner;

// public class CountWord {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the string to be counted: ");
//         String sentence = scanner.nextLine().trim();

//         String[] words = sentence.split("\\s+");
//         int total = words.length;

//         System.out.println("The given string is: " + sentence);
//         System.out.println("The number of words in the given string is: " + total);
//     }
// }
