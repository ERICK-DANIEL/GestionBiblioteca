package Biblioteca;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private boolean estado;
    private static int nLibros;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = false;
        this.nLibros++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static int getnLibros() {
        return nLibros;
    }

    @Override
    public String toString() {
        return "Libro [Titulo = " + getTitulo() + ", Autor = " + getAutor() + ", Isbn = " + getIsbn()
                + ", Estado = " + isEstado() + "]";
    }
}
