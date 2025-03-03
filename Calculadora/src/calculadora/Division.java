
package calculadora;


public class Division {
    public Division(){
    
    }
    public double calcular(double num1, double num2) {
        if (num2 == 0 || num1 == 0) {
            System.out.println("ERROR: No se puede dividir entre cero");
        }
        return num1 / num2;
    }
}


