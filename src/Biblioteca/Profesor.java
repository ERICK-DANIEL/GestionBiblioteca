package Biblioteca;

public class Profesor extends Usuario{

    public Profesor(String matricula, String nombres, String apellidos, String correo) {
        super(matricula, nombres, apellidos, correo);
    }

    @Override
    public String toString() {
        return "Profesor [Matricula = " + getMatricula() + ", Nombres = " + getNombres() + ", Apellidos = "
                + getApellidos() + "]";
    }
}
