
package beginnerjava;

import java.util.Scanner;


public class ControlStatementDemo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num;
       System.out.print("Enter any integer: ");
       num = input.nextInt();
       
       if(num > 0) {
           System.out.println("The number is positive: "+num);
       } else if(num == 0) {
           System.out.println("The number is Zero: "+num);
       } else {
           System.out.println("The number is negative: "+num);
       }
    }
}
