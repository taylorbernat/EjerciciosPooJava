
package deteccionintrusosmovimiento;


public class Detector1 {
    public Detector1(){
        
    }
    public void detectar(String dato){
        if(dato.equals("") || dato.equals(null)){
            System.out.println("No se decto nada");
        }else{
            System.out.println("Se detecto a alguien");
        }
    }
    
}
