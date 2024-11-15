
package beginnerjava;

// + Unary plus is used to convert positive number
// - Unary minus is used to convert negative number
// What is Unary Operator?
// Ans: If we use only + or - operator before an operand such as +x or -x
public class UnaryDemo {
    public static void main(String[] args) {
        int x = -10;
        int result;
        
        result = +x; // -10 (+ * - is equal to -)
        System.out.println("They unary value of x: "+result);
        
        result = -x; // 10 (- * - is equal to +)
        System.out.println("They unary value of x: "+result);
        
    }
}
