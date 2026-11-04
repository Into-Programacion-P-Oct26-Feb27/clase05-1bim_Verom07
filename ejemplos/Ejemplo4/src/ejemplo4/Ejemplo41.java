/*
 Realizar un programa en java que permita presentar un mensaje de: 
acceso correcto, si el valor ingresaso para la variable ciudad tiene el valor 
de Loja o Machala o Guayaquil; caso contrario, presentar un mensaje de acceso incorrecto
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Expresiones lógicas con cadenas en Java
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String ciudad;
        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine(); // Quito
        //F           or          //F         >>>>> F
        if (ciudad.equals("Loja") && ciudad.equals("Machala") && 
                ciudad.equals("Guayaquil")) {
            // La cadena no tiene sentido ya que una ciudad no puede tner tres variables
            // por ello no se puede usar el and en este caso solo se usa el or
            // para que la expresión tenga sentido y permita el acceso, con el and 
            // toda la expresión tiene que ser verdadera y con el or con una verdadera
            // ya se hace verdadera la expresión en general
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }

    }

}
