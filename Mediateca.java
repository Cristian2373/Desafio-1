import java.util.ArrayList;

public class Mediateca {
    private ArrayList<Material> materiales = new ArrayList<>();
    private int correlativoLibro = 1;
    private int correlativoRevista = 1;
    private int correlativoCDA = 1;
    private int correlativoDVD = 1;

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public void listarMateriales() {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales disponibles.");
        } else {
            for (Material material : materiales) {
                material.mostrarInfo();
                System.out.println("-------------------");
            }
        }
    }

    // Métodos para modificar, buscar y borrar materiales.
}
