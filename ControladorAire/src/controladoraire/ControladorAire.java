
package controladoraire;
import java.util.Scanner;

public class ControladorAire {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
      
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double temperaturaIngresada = respuesta.nextDouble();

            System.out.print("Ingrese la humedad en porcentaje: ");
            double humedadIngresada = respuesta.nextDouble();

            Temperatura temp = new Temperatura(temperaturaIngresada);
            Humedad hum = new Humedad(humedadIngresada);

            AireAcondicionado aire = new AireAcondicionado();

            aire.controlar(temp, hum);
            aire.mostrarEstado(); 

            System.out.println("¿Desea ingresar otra temperatura y humedad? (si/no): ");
            String respuesta2 = respuesta.next();

            if (!respuesta2.equalsIgnoreCase("si")) {
                continuar = false;                    
            }
        }
        
        System.out.println("Programa finalizado.");
    }
}