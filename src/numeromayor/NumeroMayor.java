/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;

// Importo el paquete java.util para utilizar la clase Scanner
import java.util.*;

/**
 *
 * @author Amarico
 */
public class NumeroMayor {

    // Declaro tres variables de tipo entero
    int numero1;
    int numero2;
    int numero3;
    
    Scanner entrada = new Scanner(System.in);

    public void ejecutaPrograma() {

        imprimeResultado();
    }
    // Método imprimeResultado
    public void imprimeResultado() {
        
        System.out.println("Introduce tres numeros y te dire cuál es el mayor");
        
        System.out.println("Introduce el primer número: ");
        
        numero1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        
        numero2 = entrada.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        
        numero3 = entrada.nextInt();

        if ((numero1 > numero2) && (numero1 > numero3)) {

            System.out.println("El número mayor es el : " + numero1);

        } else if ((numero2 > numero1) && (numero2 > numero3)) {

            System.out.println("El núero mayor es el : " + numero2);

        }else
            
            System.out.println("El numero " + numero3 + " es mayor");
    }
    
    
    
    
    
}
