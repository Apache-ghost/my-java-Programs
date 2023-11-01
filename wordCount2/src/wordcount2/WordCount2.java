/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class WordCount2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a paragraph: ");
        String userinput = scan.nextLine();
        scan.close();
        userinput = userinput.trim();
        int count = 0;
        if (userinput.length() == 0) {
            count = 0;
        } else {
            count++;
            for (int i = 0; i < userinput.length(); i++) {
                if (userinput.charAt(i) == ' ' && (userinput.charAt(i + 1) != ' ')) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
