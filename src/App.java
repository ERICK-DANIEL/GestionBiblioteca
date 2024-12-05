import java.util.ArrayList;
import java.util.Scanner;
import Biblioteca.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String matricula, nombres, apellidos, correo, carrera, semestre, isbn, titulo, autor, fechaPrestamo, fechaDevolucion;
        boolean continuar = false;
        int opcion;

        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();

        do{
            System.out.println("========== Menú principal ==========");
            System.out.println("-- Gestionar usuarios --");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Profesor");
            System.out.println("3. Actualizar Estudiante");
            System.out.println("4. Actualizar Profesor");
            System.out.println("5. Eliminar Estudiante");
            System.out.println("6. Eliminar Profesor");
            System.out.println("\n-- Gestionar libros --");
            System.out.println("7. Registrar Libro");
            System.out.println("8. Actualizar Libro");
            System.out.println("9. Eliminar Libro");
            System.out.println("\n-- Gestionar prestamos --");
            System.out.println("10. Realizar prestamo");
            System.out.println("11. Realizar devolución");
            System.out.println("\n-- Mostrar --");
            System.out.println("12. Listar prestamos");
            System.out.println("13. Mostrar libros");
            System.out.println("14. Mostrar estudiantes");
            System.out.println("15. Mostrar profesores");
            System.out.println("\n16. Salir");
            System.out.println("\nIngresa la opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingrese la matricula: ");
                        matricula = input.nextLine();
                        System.out.println("Ingrese los nombres: ");
                        nombres = input.nextLine();
                        System.out.println("Ingrese los apellidos: ");
                        apellidos = input.nextLine();
                        System.out.println("Ingrese el correo: ");
                        correo = input.nextLine();
                        System.out.println("Ingrese la carrera: ");
                        carrera = input.nextLine();
                        System.out.println("Ingrese el semestre: ");
                        semestre = input.nextLine();
                        usuarios.add(new Estudiante(matricula, nombres, apellidos, correo, carrera, semestre));
                    } catch (Exception e) {
                        System.out.println("No se pudo registrar el estudiante");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese la matricula: ");
                        matricula = input.nextLine();
                        System.out.println("Ingrese los nombres: ");
                        nombres = input.nextLine();
                        System.out.println("Ingrese los apellidos: ");
                        apellidos = input.nextLine();
                        System.out.println("Ingrese el correo: ");
                        correo = input.nextLine();
                        usuarios.add(new Profesor(matricula, nombres, apellidos, correo));
                    } catch (Exception e) {
                        System.out.println("No se pudo registrar el profesor");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Ingrese la matricula del estudiante a actualizar: ");
                        matricula = input.nextLine();
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (matricula.equals(usuarios.get(i).getMatricula())) {
                                System.out.println("Ingrese los nuevos nombres: ");
                                nombres = input.nextLine();
                                usuarios.get(i).setNombres(nombres);
                                System.out.println("Ingrese los nuevos apellidos: ");
                                apellidos = input.nextLine();
                                usuarios.get(i).setApellidos(apellidos);
                                System.out.println("Ingrese el nuevo correo: ");
                                correo = input.nextLine();
                                usuarios.get(i).setCorreo(correo);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo actualizar el estudiante");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Ingrese la matricula del profesor a actualizar ");
                        matricula = input.nextLine();
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (matricula.equals(usuarios.get(i).getMatricula())) {
                                System.out.println("Ingrese los nuevos nombres: ");
                                nombres = input.nextLine();
                                usuarios.get(i).setNombres(nombres);
                                System.out.println("Ingrese los nuevos apellidos: ");
                                apellidos = input.nextLine();
                                usuarios.get(i).setApellidos(apellidos);
                                System.out.println("Ingrese el nuevo correo: ");
                                correo = input.nextLine();
                                usuarios.get(i).setCorreo(correo);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo actualizar el profesor");
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Ingrese la matricula del estudiante a eliminar: ");
                        matricula = input.nextLine();
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (matricula.equals(usuarios.get(i).getMatricula())) {
                                usuarios.remove(i);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo eliminar el estudiante");
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Ingrese la matricula del profesor a eliminar: ");
                        matricula = input.nextLine();
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (matricula.equals(usuarios.get(i).getMatricula())) {
                                usuarios.remove(i);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo eliminar el profesor");
                    }
                    break;
                case 7:
                    try {
                        System.out.println("Ingrese el ISBN: ");
                        isbn = input.nextLine();
                        System.out.println("Ingrese el título: ");
                        titulo = input.nextLine();
                        System.out.println("Ingrese el autor: ");
                        autor = input.nextLine();
                        libros.add(new Libro(isbn, titulo, autor));
                    } catch (Exception e) {
                        System.out.println("No se pudo registrar el libro");
                    }
                    break;
                case 8:
                    try {
                        System.out.println("Ingrese el ISBN del libro a actualizar: ");
                        isbn = input.nextLine();
                        for (int i = 0; i < Libro.getnLibros(); i++) {
                            if (isbn.equals(libros.get(i).getIsbn())) {
                                System.out.println("Ingrese el nuevo título: ");
                                titulo = input.nextLine();
                                libros.get(i).setTitulo(titulo);
                                System.out.println("Ingrese el nuevo autor: ");
                                autor = input.nextLine();
                                libros.get(i).setAutor(autor);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo actualizar el libro");
                    }
                    break;
                case 9:
                    try {
                        System.out.println("Ingrese el ISBN del libro a eliminar: ");
                        isbn = input.nextLine();
                        for (int i = 0; i < Libro.getnLibros(); i++) {
                            if (isbn.equals(libros.get(i).getIsbn())) {
                                libros.remove(i);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo eliminar el libro");
                    }
                    break;
                case 10:
                    try {
                        System.out.println("Ingrese la matricula del usuario: ");
                        matricula = input.nextLine();
                        System.out.println("Ingrese el ISBN del libro: ");
                        isbn = input.nextLine();
                        System.out.println("Ingrese la fecha del prestamo: ");
                        fechaPrestamo = input.nextLine();
                        System.out.println("Ingrese la fecha de la devolución: ");
                        fechaDevolucion = input.nextLine();
                            for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (matricula.equals(usuarios.get(i).getMatricula())) {
                                for (int j = 0; j < Libro.getnLibros(); j++) {
                                    if (isbn.equals(libros.get(j).getIsbn())) {
                                        prestamos.add(new Prestamo(fechaPrestamo, fechaDevolucion, usuarios.get(i), libros.get(j)));
                                        libros.get(j).setEstado(true);
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo realizar el prestamo");
                    }
                    break;
                case 11:
                    try {
                        System.out.println("Ingrese la matricula del usuario: ");
                        matricula = input.nextLine();
                        System.out.println("Ingrese el ISBN del libro: ");
                        isbn = input.nextLine();
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (matricula.equals(usuarios.get(i).getMatricula())) {
                                for (int j = 0; j < Libro.getnLibros(); j++) {
                                    if (isbn.equals(libros.get(j).getIsbn())) {
                                        for (int k = 0; k < Prestamo.nPrestamos; k++) {
                                            if (usuarios.get(i).getMatricula().equals(prestamos.get(k).getUsuario().getMatricula()) && libros.get(j).getIsbn().equals(prestamos.get(k).getLibro().getIsbn())) {
                                                prestamos.remove(k);
                                                libros.get(j).setEstado(false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la devolución");
                    }
                    break;
                case 12:
                    try {
                        for (int i = 0; i < Prestamo.nPrestamos; i++) {
                            System.out.println(prestamos.get(i));
                        }
                    } catch (Exception e) {
                        System.out.println("No hay prestamos registrados");
                    } 
                    break;
                case 13:
                    try {
                        for (int i = 0; i < Libro.getnLibros(); i++) {
                            System.out.println(libros.get(i));
                        }
                    } catch (Exception e) {
                        System.out.println("No hay libros registrados");
                    }
                    break;
                case 14:
                    try {
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (usuarios.get(i) instanceof Estudiante) {
                                System.out.println(usuarios.get(i));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No hay estudiantes registrados");
                    }
                    break;
                case 15:
                    try {
                        for (int i = 0; i < Usuario.nUsuarios; i++) {
                            if (usuarios.get(i) instanceof Profesor) {
                                System.out.println(usuarios.get(i));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No hay profesores registrados");
                    }
                    break;
                case 16:
                    System.out.println("Saliendo del sistema...");
                    continuar = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while(continuar == false);
    }
}
