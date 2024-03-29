package escuelariogrande;


public class EscuelaRioGrande {

    // Muestra las acciones de la base de datos,
    // así como las impresiones en consola
    public static void main(String[] args) {
        // Creamos tres objetos correspondientes a un maestro, un alumno y un tutor
        Maestro maestro1 = new Maestro(1, "Juan", "Díaz", "juan_diaz@riogrande.edu");
        Alumno alumno1 = new Alumno(2, "Liliana", "Olvera", "lily_olvera@riogrande.edu");
        // Para crear un nuevo tutor, se necesita pasar un objeto de tipo Alumno
        // a su constructor
        Tutor tutor1 = new Tutor(3, "Linda", "Ramírez", "linda_ramirez@riogrande.edu", alumno1);
        
        // Imprimimos en consola los datos de cada uno de ellos
        System.out.println("Maestro.\n" + maestro1.imprimirPerfil());
        System.out.println("Alumno.\n"+ alumno1.imprimirPerfil());
        System.out.println("Tutor.\n" + tutor1.imprimirPerfil());
        
        // Guardamos una calificación de 9.5 para el alumno1
        alumno1.guardarCalificacion(9.5);
        // Luego, imprimimos en consola su calificación
        System.out.println(alumno1.mostrarCalificaciones());
        
        // Volvemos a cambiar la calificación del alumno1
        alumno1.guardarCalificacion(10.0);
        // Después, imprimimos la calificación del alumno1 desde el objeto de tutor1
        System.out.println(tutor1.mostrarCalificaciones());
        
        // Ahora, comprobamos que se pueden cambiar los datos de cada una de las
        // personas, y volvemos a imprimir sus perfiles
        maestro1.setNombre("Marco");
        maestro1.setCorreoElectronico("marco_diaz@riogrande.edu");
        System.out.println(maestro1.imprimirPerfil());
        
        alumno1.setApellido("Dominguez");
        alumno1.setCorreoElectronico("lily_dominguez@riogrande.edu");
        System.out.println(alumno1.imprimirPerfil());
        
        tutor1.setId(4);
        System.out.println(tutor1.imprimirPerfil());
    }
    
}
