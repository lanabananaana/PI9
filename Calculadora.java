
package calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int opcion;
        int n1;
        int n2;
        int n3;
        int r;
        
        System.out.println ("Elige operacion a realizar");
        System.out.println ("1. Suma");
        System.out.println ("2. Resta");
        System.out.println ("3. Multiplicacion");
        System.out.println ("4. Division");
        opcion = leer.nextInt ();
        
        System.out.println ("Escribe el primer numero:");
        n1 = leer.nextInt ();
        System.out.println ("Escribe el segundo numero:");
        n2 = leer.nextInt ();
        
        switch (opcion) {
            case 1:
                r=n1+n2;
                System.out.println ("El resultado es"+r);
                break;
            case 2:
                r=n1-n2;
                System.out.println ("El resultado es"+r);
                break;
            case 3:
                r=n1*n2;
                System.out.println ("El resultado es"+r);
            case 4:
                r=n1/n2;
                System.out.println ("El resultado es"+r);
                
                
            
        }
        
    
    }
    
}
