
package controlaccesotienda;

import java.util.Scanner;

public class HorarioAtencion {
    public HorarioAtencion(){
    
    }
    public boolean horario(){
        System.out.println("Escriba la hora actual");
        Scanner respuesta =  new Scanner(System.in);
        float validez = respuesta.nextFloat();
        if(validez<8.1 || validez>6.2){
            return true;
        }else{
            return false;
        
        }
    
    }
}
