
package sistemadereservas;

import java.util.Scanner;

public class Persona{
    private String nombre;
    private int id;
    private String correo;
    public Scanner respuesta = new Scanner(System.in);

    public Persona(String nombre,int id,String correo){
        this.nombre=nombre;
        this.id=id;
        this.correo=correo;
    }
    public void pedirNombre(){
        System.out.println("Escriba su hombre");
        String nombre2 = respuesta.nextLine();
        this.nombre=nombre2;
    }
    public void pedirId(){
        int control ;
        do{
        try {
            System.out.println("Escriba su Id");
            int id2 = respuesta.nextInt();
            respuesta.nextLine();
            this.id=id2;
            control=1;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: tiene que se numeros");
            respuesta.nextLine();  
            control=0;
        } 
        }while(control==0);

        
    }
    public void pedirCorreo(){
        System.out.println("Escriba su correo");
        String correo2 = respuesta.nextLine();
        this.correo=correo2;
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    public int getId(){
        
        return this.id;
    }
    public String getCorreo(){
        return this.correo;
    }
}
