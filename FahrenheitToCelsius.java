
package beginnerjava;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        
        System.out.print("The value of fahrenheit: ");
        fahrenheit = input.nextDouble();
        
        celsius = (5 / 9)*(fahrenheit - 32);
        System.out.println("The result of temperature in celsius: "+celsius);
    }
}
