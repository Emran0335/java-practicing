
package beginnerjava;

import java.util.Scanner;


public class InputArithmaticDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        
        System.out.print("Enter Frist number : ");
        num1 = input.nextInt();
        
        System.out.print("Enter Second number : ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Add = "+result);
        
        result = num1 - num2;
        System.out.println("Sub = "+result);
        
        result = num1 * num2;
        System.out.println("Mul = "+result);
        
        result = num1 / num2;
        System.out.println("Div = "+result);
        
        result = num1 % num2;
        System.out.println("Mod = "+result);
        
    }
}
