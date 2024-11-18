
package beginnerjava;

import java.util.Scanner;
/*
Operator - 
1. Artihmatic Operator
2. Assignment Operator
3. Relational Operator
4. Logical Operator
5. Conditional Operator
6. Unary Operator
7. Bitwise Operator
8. Special Operator
*/

public class VowelConsonantDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);  
        
        if(ch=='a'|| ch=='A') {
            System.out.println("Vowel");
        } 
        else if(ch=='e' || ch=='E') {
            System.out.println("Vowel");
        } 
        else if(ch=='i' || ch=='I') {
            System.out.println("Vowel");
        } 
        else if(ch=='o' || ch=='O') {
            System.out.println("Vowel");
        } 
        else if(ch=='u' || ch=='U') {
            System.out.println("Vowel");
        } 
        else {
            System.out.println("Consonant");
        }
    }
}
