
package controllucesautomatico;

public class Tiempo {
    
    public Encendedor objEncendedor = new Encendedor();
    public DeccionMovimiento objDeccionMovimiento = new DeccionMovimiento();
    
    
    public Tiempo(){
    
    
    }
    
    public void zonaHoraria(){
        while (true) {
            System.out.println("Es de dia");
            System.out.println("Se apagaron las luces");
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Es de noche");
            

            boolean decteccion=objDeccionMovimiento.hayMovimiento();
            objEncendedor.Luz(decteccion);
            
             try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
