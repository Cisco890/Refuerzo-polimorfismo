import java.util.ArrayList;
import java.util.List;

public class Bibliotecam {
    public static void main(String[] args) {
        // Crear objetos de la biblioteca
        Libro libro1 = new Libro(100001, "Autor1", "Libro1", "Ciencia", 3, true, "Editorial1");
        Revista revista1 = new Revista(200001, "Revista1", "Ciencia", 5, true, 2023, 1);
        Cliente cliente1 = new Cliente(300001, "Cliente1", "Dirección1");

        // Agregar objetos a la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(revista1);
        biblioteca.agregarCliente(cliente1);

        // Mostrar información inicial
        System.out.println("Información inicial de la biblioteca:");
        biblioteca.mostrarInformacionLibros();

        // Agregar nueva revista
        Revista revista2 = new Revista(200002, "Revista2", "Historia", 3, true, 2023, 2);
        biblioteca.agregarPublicacion(revista2);

        // Mostrar información final
        System.out.println("\nInformación final de la biblioteca:");
        biblioteca.mostrarInformacionLibros();

        // Buscar publicaciones por ID
        System.out.println("\nBuscar publicación por ID:");
        DatosLibros libroEncontrado = biblioteca.buscarPublicacionPorId(100001);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }

        DatosLibros revistaEncontrada = biblioteca.buscarPublicacionPorId(200001);
        if (revistaEncontrada != null) {
            System.out.println("Revista encontrada: " + revistaEncontrada.getTitulo());
        } else {
            System.out.println("Revista no encontrada.");
        }
    }
}

class Biblioteca {
    private List<DatosLibros> publicaciones;
    private List<Cliente> clientes;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarPublicacion(DatosLibros publicacion) {
        publicaciones.add(publicacion);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public DatosLibros buscarPublicacionPorId(int id) {
        for (DatosLibros publicacion : publicaciones) {
            if (publicacion.getId() == id) {
                return publicacion;
            }
        }
        return null; // No se encontró la publicación
    }

    public void mostrarInformacionLibros() {
        System.out.println("Información de libros en la biblioteca:");
        for (DatosLibros publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                System.out.println("Autor: " + publicacion.getAutor());
                System.out.println("Materia: " + publicacion.getMateria());
                System.out.println("Título: " + publicacion.getTitulo());
                System.out.println();
            }
        }
    }
}
