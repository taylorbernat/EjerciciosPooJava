
package controlaccesotienda;

public class ControlAcceso {
    
    
    MembresiaCliente objMembresiaCliente = new MembresiaCliente();
    HorarioAtencion objHorarioAtencion = new HorarioAtencion();
    Empleado objEmpleado = new Empleado();
    
    public ControlAcceso(){
        
    }
        
    public void control(){
        boolean membresia=objMembresiaCliente.membresia();
        boolean hora=objHorarioAtencion.horario();
        boolean empleado=objEmpleado.comprovante();
        if(membresia && hora ){
            System.out.println("Bienvenido a la tienda");
        
        }else if(empleado){
            System.out.println("Bienvenido empleado");
        }else{
            System.out.println("No tiene permitido acceder a la tienda");
        
        }
    }
}
