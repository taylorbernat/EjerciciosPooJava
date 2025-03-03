
package controlaccesotienda;

import java.util.Scanner;

public class Empleado {
    public Empleado(){
    
    }
    public boolean comprovante(){
        System.out.println("Tiene su tarjeta de empleado");
        Scanner respuesta =  new Scanner(System.in);
        String validez = respuesta.next();
        if(validez.equalsIgnoreCase("si")){
            return true;
        }else{
            return false;
        
        }
    }
}
