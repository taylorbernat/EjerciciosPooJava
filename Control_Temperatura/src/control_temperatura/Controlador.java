
package control_temperatura;

public class Controlador {
    private Sensor sensor;
    private Estado estadoActual;

    public Controlador() {
        this.sensor = new Sensor();
        this.estadoActual = new Inactivo();
    }

    public void ejecutar() {
        while (true) {
            int temperatura = sensor.leerTemperatura();
            System.out.println("Temperatura actual: " + temperatura + "°C");

            if (temperatura < 10) {
                cambiarEstado(new Calefactor());
            } else if (temperatura >= 10 && temperatura <= 25) {
                cambiarEstado(new Inactivo());
            } else {
                cambiarEstado(new Ventilador());
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void cambiarEstado(Estado nuevoEstado) {
        if (this.estadoActual != nuevoEstado) {
            this.estadoActual.desactivar();
            this.estadoActual = nuevoEstado; 
            this.estadoActual.activar(); 
        }
    }

}
