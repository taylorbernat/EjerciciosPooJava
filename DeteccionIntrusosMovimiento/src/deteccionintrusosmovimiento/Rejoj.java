package deteccionintrusosmovimiento;

import java.util.Scanner; 

public class Rejoj {
    public Detector1 sensor1 = new Detector1();
    public Detector2 sensor2 = new Detector2();
    public Detector3 sensor3 = new Detector3();
    public Scanner respuesta = new Scanner(System.in);
    
    public void tiempo(){

        System.out.println("Es de dia");
        try{
            Thread.sleep(10000); 
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Es de noche");

        System.out.println("Ingresa el dato para detectar movimiento en la sala:");
        String dato = respuesta.nextLine(); 

        sensor1.detectar(dato);
        System.out.println("Ingresa el dato para detectar movimiento en el patio:");
        String dato2 = respuesta.nextLine(); 
        sensor2.detectar(dato2);
        
        
        System.out.println("Ingresa el dato para detectar movimiento :");
        String dato3 = respuesta.nextLine(); 
        sensor3.detectar(dato3);
    }
}
