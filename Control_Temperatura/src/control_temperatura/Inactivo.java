
package control_temperatura;


class Inactivo extends Estado {
    public void activar() {
        System.out.println("El sistema esta inactivo.");
    }

    public void desactivar() {
        System.out.println("El sistema sigue inactivo.");
    }
}

