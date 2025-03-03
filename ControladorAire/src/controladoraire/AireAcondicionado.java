
package controladoraire;

class AireAcondicionado {
    private boolean encendido;

    public AireAcondicionado() {
        this.encendido = false;
    }

    public void controlar(Temperatura temp, Humedad hum) {
        if ((temp.obtenerValor() > 28 && hum.obtenerValor() > 60) || temp.obtenerValor() > 30) {
            encendido = true; 
        } else {
            encendido = false;
        }
    }
    
 public void mostrarEstado() {
        if (encendido) {
            System.out.println("El aire acondicionado esta ENCENDIDO.");
        } else {
            System.out.println("El aire acondicionado esta APAGADO.");
        }
    }
}
