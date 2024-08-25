package data.structure.project1.library;

public class Book {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Book(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba disponible.");
        }
    }

    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Disponible: " + (disponible ? "Sí" : "No");
    }
}
