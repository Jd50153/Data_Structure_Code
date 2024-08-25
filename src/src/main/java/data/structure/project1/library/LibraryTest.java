package data.structure.project1.library;

public class LibraryTest {
    public static void main(String[] args) {
        Library biblioteca = new Library();

        biblioteca.agregarLibro(new Book("Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.agregarLibro(new Book("El coronel no tiene quien le escriba", "Gabriel García Márquez"));
        biblioteca.agregarLibro(new Book("La luna", "Julio Cortázar"));
        biblioteca.agregarLibro(new Book("La tierra", "Julio Cortázar"));

        System.out.println("Buscar libros de Gabriel García Márquez:");
        biblioteca.buscarLibros("Gabriel García Márquez");

        System.out.println("\nBuscar libros con título 'La luna':");
        biblioteca.buscarLibros("La luna");

        biblioteca.prestarLibro("Cien años de soledad");
        biblioteca.prestarLibro("Cien años de soledad");

        biblioteca.devolverLibro("Cien años de soledad");
        biblioteca.devolverLibro("Cien años de soledad");
    }
}
