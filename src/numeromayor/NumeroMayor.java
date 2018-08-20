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

    public void ejecutaPrograma() {

        imprimeResultado();
    }
    // Método imprimeResultado
    public void imprimeResultado() {

        if ((numero1 > numero2) && (numero1 > numero3)) {

            System.out.println("El número mayor es: " + numero1);

        } else if ((numero2 > numero1) && (numero2 > numero3)) {

            System.out.println("El núero mayor es: " + numero2);

        }else
            
            System.out.println("El numero " + numero3 + " es mayor");
    }
    
    
    
    
    
}
