
package control_temperatura;

class Ventilador extends Estado {
    
    public void activar() {
        System.out.println("El ventilador esta activado.");
    }

    public void desactivar() {
        System.out.println("El ventilador esta desactivado.");
    }
}
