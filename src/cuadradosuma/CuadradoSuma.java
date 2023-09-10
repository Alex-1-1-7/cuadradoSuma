/*
Ejercicio 6: Hacer un programa que calcule
el cuadrado de una suma.
(a+b)2 = a2 + b2 + 2a*b
el 2 hace referencia a que esta elevado a ese numero 
 */
package cuadradosuma;

import java.util.Scanner;

public class CuadradoSuma {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b, resultado;
        System.out.println("------cuadrado de una suma-----");
        System.out.println("ingrese el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("ingrese el valor de b: ");
        b = teclado.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2*a*b;
        System.out.println("el resultado de el cuadrado de la suma (a+b)2 es: "+resultado);
    }
    
}
