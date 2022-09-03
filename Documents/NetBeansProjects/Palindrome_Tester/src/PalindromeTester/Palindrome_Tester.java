//Nishat Q
//Aug 3 2022
package PalindromeTester;
import java.util.Scanner;

public class Palindrome_Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
         System.out.println("Enter words or phrases that you believe is a palindrome."
                 + " Then enter a blank line to end the program."
                 + " The program will then inform you how many palindromes were found.");
        String list, reverse, punct;
        int count = 0;
        while (true) {
            list = scnr.nextLine();
            if (list.isEmpty())
                break;
            punct = "";
            reverse = "";
            for (int i =0 ; i < list.length(); i++) {
                if (Character.isAlphabetic(list.charAt(i))) {
                    punct = punct + Character.toLowerCase(list.charAt(i));
                    reverse = Character.toLowerCase(list.charAt(i)) + reverse;
                }
            }
            if (reverse.equalsIgnoreCase(punct)) {
                ++count;
                
            }      
        }
        System.out.println("\nNumber of palindromes: " + count);
    }
}
