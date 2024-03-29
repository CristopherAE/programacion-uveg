package escuelariogrande;


public class Alumno extends Persona implements IMostrarCalificaciones {
    private double calificacion;
    
    Alumno(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public double getCalificacion() {
        return this.calificacion;
    }
    
    public void guardarCalificacion(double calificacion) {
        this.setCalificacion(calificacion);
    }
    
    /**
     *
     * @return Muestra la calificacion del alumno actual
     */
    @Override
    public String mostrarCalificaciones() {
        return "Alumno: " + this.getNombre() + " " + this.getApellido() +
                "\nCalificación: " + this.getCalificacion() +
                "\n";
    }
}
