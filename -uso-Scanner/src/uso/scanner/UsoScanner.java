
package uso.scanner;

import java.util.Scanner;


public class UsoScanner {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
    
}
