import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mediateca mediateca = new Mediateca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Mediateca - Menú:");
            System.out.println("1. Agregar material");
            System.out.println("2. Modificar material");
            System.out.println("3. Listar materiales disponibles");
            System.out.println("4. Borrar material");
            System.out.println("5. Buscar material");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para agregar material
                    break;
                case 2:
                    // Lógica para modificar material
                    break;
                case 3:
                    mediateca.listarMateriales();
                    break;
                case 4:
                    // Lógica para borrar material
                    break;
                case 5:
                    // Lógica para buscar material
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
