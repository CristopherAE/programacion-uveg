package escuelariogrande;


public class Tutor extends Persona implements IMostrarCalificaciones {
    public Alumno alumno;
    
    Tutor(int id, String nombre, String apellido, String correoElectronico,
            Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        this.alumno = alumno;
    }
    
    /**
     *
     * @return Muestra la calificacion del alumno del tutor
     */
    @Override
    public String mostrarCalificaciones() {
        return "Tutor: " + this.getNombre() + " " + this.getApellido() +
                "\nAlumno: " + this.alumno.getNombre() + " " + this.alumno.getApellido() +
                "\nCalificacion: " + this.alumno.getCalificacion() +
                "\n";
    }
}
