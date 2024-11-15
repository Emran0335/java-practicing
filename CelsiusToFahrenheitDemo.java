
package beginnerjava;

import java.util.Scanner;


public class CelsiusToFahrenheitDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        
        System.out.print("The celsius value: ");
        celsius = input.nextDouble();
        
        fahrenheit = (9/5)*celsius + 32;
        
        System.out.println("The value of temperature in fahrenheit: "+fahrenheit);
    }
}
