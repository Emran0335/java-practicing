
package beginnerjava;

public class IncrementAndDecrementDemo {
    public static void main(String[] args) {
        int x = 25;
        int p = 10;
        int y, q;
        
        // pre increment
        q = ++p;
        System.out.println("The vlue of q after p is incremented: "+q); // q = 11
        
        q = p;
        System.out.println("The value of p again: "+q); // same q = 11
        
        // post increment
        y = x++;  // here x is 25 but if x is found again then the value will increment to 26
        System.out.println("y = "+y); // y = 25
        
        y = x; // x is found and one will be incremented
        System.out.println("y after x value is found = "+y); // y = 26
        
        
        
        int d = 20;
        int a = 15;
        int m, n;
        
        // pre decrement
        m = --d;
        System.out.println("The value of m after d is decremented: "+m); // m = 19
        
        m = d;
        System.out.println("The of m again: "+m); // m = 19
        
        // post decrement
        n = a--; // here a is 15 but its value will be decremented if a is found later
        System.out.println("n = "+n); // n = 15
        
        n = a; // now a is found and its value will be decremented by one
        System.out.println("n after a value is found: "+n); // n = 14
    }
}
