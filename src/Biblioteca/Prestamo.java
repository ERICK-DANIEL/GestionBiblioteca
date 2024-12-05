package Biblioteca;

public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Usuario usuario;
    private Libro libro;
    public static int nPrestamos;

    public Prestamo(String fechaPrestamo, String fechaDevolucion, Usuario usuario, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.libro = libro;
        this.nPrestamos++;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getnPrestamos() {
        return nPrestamos;
    }

    @Override
    public String toString() {
        return "Prestamo [Fecha de Prestamo = " + getFechaPrestamo() + ", Fecha de Devolucion = " + getFechaDevolucion()
                + ", Estudiante = " + getUsuario() + ", Libro = " + getLibro() + "]";
    }
}