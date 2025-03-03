
package controlaccesotienda;

import java.util.Scanner;

public class MembresiaCliente {
    public MembresiaCliente(){
    
    
    }
    public boolean membresia(){
        System.out.println("Su membresia aun es valida");
        Scanner respuesta =  new Scanner(System.in);
        String validez = respuesta.next();
        if(validez.equalsIgnoreCase("si")){
            return true;
        }else{
            return false;
        
        }
    }
    
}
