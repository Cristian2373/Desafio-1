public class CDAudio extends Material {
    private String artista;
    private String genero;
    private double duracion;
    private int numCanciones;
    private int unidadesDisponibles;

    public CDAudio(String codigo, String titulo, String artista, String genero, double duracion, int numCanciones, int unidadesDisponibles) {
        super(id, titulo, codigo, titulo);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numCanciones = numCanciones;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Código: " + codigo + "\nTítulo: " + titulo + "\nArtista: " + artista +
                "\nGénero: " + genero + "\nDuración: " + duracion +
                "\nNúmero de canciones: " + numCanciones +
                "\nUnidades disponibles: " + unidadesDisponibles);
    }
}
