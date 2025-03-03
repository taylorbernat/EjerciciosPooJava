
package sistemadereservas;

public class SistemaDeReservas {

    
    public static void main(String[] args) {


        Usuario objUsuario = new Usuario("",0,"","");
        Silla objSilla = new Silla();
        Sala objSala = new Sala();
        
        
        
        
        
        objUsuario.pedirDatos();
        objUsuario.pedircontraseña();
        objUsuario.imprimirInformacion();
        objSilla.verDisponibilidad();
        objSala.eleccion();
        System.out.println("----------------INFORMACION DEL USUARIO----------------");
        objUsuario.imprimirInformacion();
        System.out.println("----------------ELCCION FINAL----------------");
        objSala.mostrarResultados();

    }
    
}
