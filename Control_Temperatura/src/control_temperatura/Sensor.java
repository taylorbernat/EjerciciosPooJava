
package control_temperatura;

import java.util.Random;

class Sensor {
    private Random random;

    public Sensor() {
        this.random = new Random();
    }

    public int leerTemperatura() {
        return random.nextInt(40);
    }
    
}

