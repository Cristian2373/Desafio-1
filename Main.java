import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String[] opciones = {"Agregar material", "Modificar material", "Listar material disponibles",
                    "Borrar Material","Buscar material", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Mediateca",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcion == 5 || opcion == JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null,"Saliendo del programa.");
                break;
            }

            switch (opcion){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no valida.");
                    break;
            }
        }
    }
}