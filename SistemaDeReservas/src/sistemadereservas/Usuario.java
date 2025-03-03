
    package sistemadereservas;


    public class Usuario extends Persona{
        private String contraseña; 
        public Usuario(String nombre,int id, String correo, String contraseña){
            super( nombre, id, correo);
        }
        public void pedirDatos(){
            super.pedirNombre();
            super.pedirId();
            super.pedirCorreo();

        }
        public void pedircontraseña(){
            System.out.println("Escriba su contraseña");
            String contraseña2 = respuesta.nextLine();
            this.contraseña=contraseña2;
        }

        public void imprimirInformacion(){
            System.out.println("Nombre:"+super.getNombre());
            System.out.println("Id:"+super.getId());
            System.out.println("Correo:"+super.getCorreo());
            System.out.println("Contraseña:"+this.contraseña);


        }

    }
