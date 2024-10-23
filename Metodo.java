import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public abstract class Libro extends Material {
    private static final Logger logger = Logger.getLogger(Libro.class);
    private int numeroPaginas;

    // Constructor
    public Libro(int id, String titulo, String autor, int numeroPaginas) {
        super(id, titulo, autor, "Libro");
        this.numeroPaginas = numeroPaginas;
    }

    // Getters y Setters
    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    // Método agregar
    @Override
    public void agregar() {
        // Validaciones previas
        if (!validarDatos()) {
            return; // Si la validación falla, no se prosigue
        }

        // Conexión a la base de datos
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Cargar el driver de MySQL si no lo has hecho ya en tu proyecto
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediateca", "root", "password");

            // Crear la consulta SQL
            String sql = "INSERT INTO Libros (titulo, autor, numero_paginas) VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);

            // Asignar valores al PreparedStatement
            ps.setString(1, getTitulo());
            ps.setString(2, getAutor());
            ps.setInt(3, getNumeroPaginas());

            // Ejecutar la consulta
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                logger.info("Libro agregado exitosamente: " + getTitulo());
                System.out.println("Libro agregado exitosamente.");
            } else {
                logger.warn("No se pudo agregar el libro.");
                System.out.println("No se pudo agregar el libro.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            logger.error("Error al agregar el libro: " + e.getMessage());
            e.printStackTrace(); // Mostrar el error en consola para depuración
        } finally {
            // Asegurarse de cerrar recursos
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                logger.error("Error al cerrar la conexión o el PreparedStatement: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    protected abstract String getAutor();

    // Método para validar los datos de entrada
    private boolean validarDatos() {
        if (getTitulo() == null || getTitulo().trim().isEmpty()) {
            logger.error("Error: El título no puede estar vacío.");
            System.out.println("Error: El título no puede estar vacío.");
            return false;
        }

        if (getAutor() == null || getAutor().trim().isEmpty()) {
            logger.error("Error: El autor no puede estar vacío.");
            System.out.println("Error: El autor no puede estar vacío.");
            return false;
        }

        if (numeroPaginas <= 0) {
            logger.error("Error: El número de páginas debe ser mayor a cero.");
            System.out.println("Error: El número de páginas debe ser mayor a cero.");
            return false;
        }

        return true;
    }
}
