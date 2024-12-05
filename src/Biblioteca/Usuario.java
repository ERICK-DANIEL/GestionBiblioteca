package Biblioteca;

public abstract class Usuario {
    private String matricula;
    private String nombres;
    private String apellidos;
    private String correo;
    public static int nUsuarios;

    public Usuario(String matricula, String nombres, String apellidos, String correo) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.nUsuarios++;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract String toString();
}
