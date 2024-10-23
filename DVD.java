public class DVD extends Material {
    private String director;
    private String genero;
    private double duracion;

    public DVD(String codigo, String titulo, String director, String genero, double duracion) {
        super(id, titulo, codigo, titulo);
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Código: " + codigo + "\nTítulo: " + titulo + "\nDirector: " + director +
                "\nGénero: " + genero + "\nDuración: " + duracion);
    }
}
