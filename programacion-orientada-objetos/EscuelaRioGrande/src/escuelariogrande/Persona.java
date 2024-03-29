package escuelariogrande;


public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    
    Persona(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public String imprimirPerfil() {
        return "ID: " + this.getId() +
                "\nNombre: " + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nCorreo Electrónico: " + this.getCorreoElectronico() +
                "\n";
    }
}
