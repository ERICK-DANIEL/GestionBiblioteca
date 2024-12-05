package Biblioteca;

public class Estudiante extends Usuario {
    private String carrera;
    private String semestre;

    public Estudiante(String matricula, String nombres, String apellidos, String correo, String carrera,
            String semestre) {
        super(matricula, nombres, apellidos, correo);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante [Matricula = " + getMatricula() + ", Nombres = " + getNombres() + ", Apellidos = "
                + getApellidos() + "]";
    }
}
