
package beginnerjava;

import java.util.Scanner;


public class InputDemoWithTypeCasting {
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
        
        double result2 = (double) num1 / num2; // type casting
        System.out.println("Div = "+result2); // num1 and result2 is a double type
        
        result = num1 % num2;
        System.out.println("Mod = "+result);
        
    }
}
