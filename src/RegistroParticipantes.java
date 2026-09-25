import java.util.Scanner;
import java.util.TreeSet;

public class RegistroParticipantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Utilizamos TreeSet para cumplir con el requisito de ordenar y consultar rangos
        TreeSet<String> estudiantes = new TreeSet<>();
        int opcion;

        do {
            System.out.println("\n--- Registro de Participantes ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Mostrar número de estudiantes");
            System.out.println("6. Mostrar estudiantes por rango (A0020 - A0080)");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del estudiante (Ej. A0032): ");
                    String id = scanner.nextLine().toUpperCase();
                    if (estudiantes.add(id)) {
                        System.out.println("Estudiante registrado exitosamente.");
                    } else {
                        System.out.println("Error: El estudiante ya se encuentra registrado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese ID a buscar: ");
                    String idBuscar = scanner.nextLine().toUpperCase();
                    if (estudiantes.contains(idBuscar)) {
                        System.out.println("El estudiante sí está registrado.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese ID a eliminar: ");
                    String idEliminar = scanner.nextLine().toUpperCase();
                    if (estudiantes.remove(idEliminar)) {
                        System.out.println("Estudiante eliminado.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de estudiantes: " + estudiantes);
                    break;
                case 5:
                    System.out.println("Total de estudiantes: " + estudiantes.size());
                    break;
                case 6:
                    System.out.println("Estudiantes entre A0020 y A0080:");
                    // Se incluye A0080 al establecer el segundo booleano como true
                    System.out.println(estudiantes.subSet("A0020", true, "A0080", true));
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}