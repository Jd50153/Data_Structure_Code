package data.structure.project1.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> libros;

    public Library() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Book libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }

    public void prestarLibro(String titulo) {
        for (Book libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (Book libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    public void buscarLibros(String consulta) {
        boolean encontrado = false;
        for (Book libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(consulta.toLowerCase()) ||
                    libro.getAutor().toLowerCase().contains(consulta.toLowerCase())) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros que coincidan con la consulta: '" + consulta + "'.");
        }
    }
}
