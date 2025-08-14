
package operaciones.aritmeticas;

import java.util.Scanner;


public class OperacionesAritmeticas {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.println("Ingrese dos numeros enteros: ");
        System.out.println("Numero 1: ");
        numero1 = input.nextInt();
        System.out.println("numero 2: ");
        numero2 = input.nextInt();
        
        System.out.println("suma: " +(numero1 + numero2));
        System.out.println("resta: " + (numero1 - numero2));
        System.out.println("multiplicacion: " + (numero1 * numero2));
        System.out.println("division: " + (numero1 / numero2));
    }
    
}
