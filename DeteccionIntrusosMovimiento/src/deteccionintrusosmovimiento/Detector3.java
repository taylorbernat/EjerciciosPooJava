/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccionintrusosmovimiento;

/**
 *
 * @author SENA
 */
public class Detector3 {
    public Detector3(){
        
    }
    public void detectar(String dato){
        if(dato.equals("") || dato.equals(null)){
            System.out.println("No se decto nada");
        }else{
            System.out.println("Se detecto a alguien");
        }
    }
}
