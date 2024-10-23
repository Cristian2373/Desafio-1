public abstract class Material {
    protected String codigo;
    protected String titulo;

    public Material(int id, String s, String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método abstracto que será implementado en las subclases.
    public abstract void mostrarInfo();
}

