
package beginnerjava;

import java.util.Scanner;


public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, area;
        
        System.out.print("Each side of square: ");
        s = input.nextDouble();
        
        area = s * s;
        
        System.out.println("The area of a square: "+area);     
    }
}
