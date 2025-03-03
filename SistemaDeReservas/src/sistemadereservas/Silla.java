
package sistemadereservas;

import java.util.Random;


public class Silla {
        private String calidad="";
        private String disponibilidad;
        public Random aletoreo = new Random();
    public Silla(){
        
    }
    public void verDisponibilidad(){
        for (int i=1 ; i<=40 ; i++){
            boolean ayuda=aletoreo.nextBoolean();
            if(ayuda){
                disponibilidad="Disponible";
            }else{
                disponibilidad="Ocupado";
            }
            
            System.out.println("El asiento "+i+" se encuentra "+disponibilidad);
        }
    }
    
    
    
    
    
}
