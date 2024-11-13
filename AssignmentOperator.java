
package beginnerjava;


public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        
        x+=y;  // x is assigned x + y (x = x + y should be read in this way)
        System.out.println("Adding, X = "+x);
        // now x = 5
        x-=y;  // x is assigned x - y
        System.out.println("Subtracting, X = "+x);
        // now x = 3
        x*=y; // x is assigned x * y
        System.out.println("Multiplying, X = "+x);
        // now x = 6
        x/=y; // x is assigned x / y
        System.out.println("Dividing, X = "+x);
        // now x = 3
        x%=y; // x is assigned x % y
        System.out.println("Reminder, X = "+x);
        // now remider is 1
    }
    
}
