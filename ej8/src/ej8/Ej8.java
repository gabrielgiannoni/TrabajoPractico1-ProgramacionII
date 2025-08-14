
package ej8;

import java.util.Scanner;


public class Ej8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num1;
        double num2;
        
        System.out.println("Ingrese dos numeros enteros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        System.out.println( num1 / num2);
    }
    
}
