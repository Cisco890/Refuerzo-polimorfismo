import java.util.ArrayList;
import java.util.List;
class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private List<DatosLibros> prestamos;

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<DatosLibros> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(DatosLibros documento) {
        if (prestamos.size() < 5) {
            prestamos.add(documento);
        } else {
            System.out.println("El cliente ha alcanzado el límite de préstamos.");
        }
    }

    public void devolverPrestamo(DatosLibros documento) {
        prestamos.remove(documento);
    }
}
