
package beginnerjava;

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        
        int c;
        
        c = a & b;
        System.out.println("a & b = "+c);
        
        c = a | b;
        System.out.println("a | b = "+c);
        
        c = a ^ b;
        System.out.println("a ^ b = "+c);
        
        c = a >> 3;
        System.out.println("a >> 3 = "+c);
        
        c = a << 3;
        System.out.println("a << 3 ="+c);
    }
}
