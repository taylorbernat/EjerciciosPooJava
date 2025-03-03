
package controllucesautomatico;

import java.util.Scanner;

public class DeccionMovimiento {
    public DeccionMovimiento(){
    
    }
    public boolean hayMovimiento(){
        System.out.println("¿Hay movimiento?");
        Scanner respuesta = new Scanner(System.in);
        String decicon = respuesta.next();
        if(decicon.equalsIgnoreCase("si")){
            return true;
        }else{
        
            return false;
        }
    
    }
}
