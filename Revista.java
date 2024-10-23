public class Revista extends Material {
    private static final int id = ;
    private String editorial;
    private String periodicidad;
    private String fechaPublicacion;
    private int unidadesDisponibles;

    public Revista(String codigo, String titulo, String editorial, String periodicidad, String fechaPublicacion, int unidadesDisponibles) {
        super(id, titulo, codigo, titulo);
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPublicacion = fechaPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Código: " + codigo + "\nTítulo: " + titulo + "\nEditorial: " + editorial +
                "\nPeriodicidad: " + periodicidad + "\nFecha de publicación: " + fechaPublicacion +
                "\nUnidades disponibles: " + unidadesDisponibles);
    }
}
