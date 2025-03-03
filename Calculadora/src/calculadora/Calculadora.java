package calculadora;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {

        Scanner respuesta = new Scanner(System.in);
        boolean continuarCalculo = true;

        while (continuarCalculo) {
            System.out.print("Ingrese el primer numero: ");
            double num1 = respuesta.nextDouble();
            
            System.out.print("Ingrese el segundo numero: ");
            double num2 = respuesta.nextDouble();
            
            System.out.print("Ingrese la operacion (+, -, *, /): ");
            String operacion = respuesta.next();
            
            double resultado = 0;
            boolean operacionValida = true;
            
            if (operacion.equals("+")) {
                Suma suma = new Suma();
                resultado = suma.calcular(num1, num2);
                
            } else if (operacion.equals("-")) {
                Resta resta = new Resta();
                resultado = resta.calcular(num1, num2);
                
            } else if (operacion.equals("*")) {
                Multiplicacion multiplicacion = new Multiplicacion();
                resultado = multiplicacion.calcular(num1, num2);
                
                
            } else if (operacion.equals("/")) {
                Division division = new Division();
                resultado = division.calcular(num1, num2);
                
                
                if (num1 ==    0|| num2 == 0 || resultado == 0) {
                    operacionValida = false;
                }
            } else {
                System.out.println("Operacion no valida.");
                operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            System.out.print("Desea realizar otro calculo? (si/no): ");
            String eleccionUsuario = respuesta.next();
            
            if (eleccionUsuario.equalsIgnoreCase("no")) {
                continuarCalculo = false;
            }
        }

        System.out.println("Gracias por usar la calculadora.");
        respuesta.close();
    }
}

