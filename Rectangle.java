
package beginnerjava;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width, length, area;
        
        System.out.print("The width of a rectangle: ");
        width = input.nextDouble();
        
        System.out.print("The length of a rectangle: ");
        length = input.nextDouble();
        
        area = width * length;
        
        System.out.println("The area of a rectangle: "+area);
    }
}
