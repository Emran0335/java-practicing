
package beginnerjava;

public class PrintData {
    
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 126587;
        float f = 10.2f;
        double d = 10.2;
        
        System.out.printf("boolean b = %b\n",b); // format specifier
        System.out.printf("character c = %c\n",c);
        System.out.printf("short s = %d\n",s); // interget is %d
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %.2f\n",f); // two digit after dot
        System.out.printf("double d = %f\n",d); // float is %f
    }
    
}
