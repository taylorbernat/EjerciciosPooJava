
package juego_fizzbuzz;

import java.util.Scanner;

public class Juego {

    public void jugar() {
        Scanner play = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
  
            System.out.println("Por favor ingresa un numero: ");
            int numeroIngresado = play.nextInt();

            Numero number = new Numero(numeroIngresado);
            
            System.out.println("El resultado para el numero " + numeroIngresado + " es: " + number.obtenerResultado());

            System.out.println("¿Quieres ingresar otro numero? (si/no): ");
            String respuesta = play.next();

            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

    }
}

