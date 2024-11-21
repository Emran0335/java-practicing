
package beginnerjava;

import java.util.Scanner;


public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter the number: ");
        num = input.nextInt();
        
        switch(num) {
            case 1: 
                System.out.println("One: "+num);
                break;
            case 2: 
                System.out.println("Two: "+num);
                break;
            case 3: 
                System.out.println("Three: "+num);
                break;
            case 4: 
                System.out.println("Four: "+num);
                break;
            default:
                System.out.println("The given number is: "+num);
        }
    }
}
