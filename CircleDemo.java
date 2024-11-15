
package beginnerjava;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, area;
        
        System.out.print("The radius of a circle: ");
        r = input.nextDouble();
        
        area = 3.1416 * r * r;
        
        System.out.println("The area of a circle: "+area);
    }
}
