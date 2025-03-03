
package sistemadereservas;

import java.util.Scanner;

public class Sala {
    
    private String pelicula;
    private int numSala;
    public Scanner respuesta = new Scanner(System.in);
    public  Sala(){
        this.pelicula="";
        this.numSala=0;
        
        
    }
    public void informacion(){
        System.out.println("1.Inception ");
        System.out.println("2.The Shawshank Redemption");
        System.out.println("3.The Dark Knight ");
        System.out.println("4.Parasite ");
    }
    public void salasDisponibles(){
        System.out.println("Asignación de salas de cine:");
        System.out.println("Inception  -> Sala: 1");
        System.out.println("The Shawshank Redemption  -> Sala: 2");
        System.out.println("The Dark Knight  -> Sala: 3");
        System.out.println("Parasite  -> Sala: 4");
    }
    public void eleccion(){
        int control=0;
        
        do{
            informacion();
            int seleccionPelicula = respuesta.nextInt();
            
            
            switch(seleccionPelicula){
            case 1:     
                pelicula="Inception";
            case 2:
                pelicula="The Shawshank Redemption";
            case 3:
                pelicula="The Dark Knight";
            case 4:
                pelicula="Parasite";
            }
            
            
            if (pelicula.equals("Inception")||pelicula.equals("The Shawshank Redemption")||pelicula.equals("The Dark Knight")||pelicula.equals("Parasite")){
                while(control==0){
                    salasDisponibles();
                    int eleccionSala = respuesta.nextInt();
                    if(eleccionSala<1 || eleccionSala>4){
                        System.out.println("ERROR: sala fuera del rango");
                    }else{
                        System.out.println("Disfrute su pelicula");
                        numSala=eleccionSala;
                        control=1;
                    }
                
                }
                
            }else{
            
                System.out.println("la pelica que selecciono no esta disponible");
            }
        
        
        }while(control==0);
    }
    public void mostrarResultados() {
        System.out.println("Resultado de la reserva:");
        System.out.println("Película: " + pelicula);
        System.out.println("Sala asignada: " + numSala);
    }
}
