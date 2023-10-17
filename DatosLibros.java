
abstract class DatosLibros {
    private int id;
    private String autor;
    private String titulo;
    private String materia;
    private int cantidadEjemplares;
    private boolean estado;

    public DatosLibros(int id, String autor, String titulo, String materia, int cantidadEjemplares, boolean estado) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public boolean isEstado() {
        return estado;
    }
}





