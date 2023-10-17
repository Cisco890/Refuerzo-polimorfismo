class Libro extends DatosLibros {
    private String editorial;

    public Libro(int id, String autor, String titulo, String materia, int cantidadEjemplares, boolean estado, String editorial) {
        super(id, autor, titulo, materia, cantidadEjemplares, estado);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }
}