import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BenchmarkSets {
    private static final int N = 1_000_000;

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Ejecución " + i + " ---");
            probar("HashSet", new HashSet<>());
            probar("TreeSet", new TreeSet<>());
            System.out.println();
        }
    }

    private static void probar(String nombre, Set<Integer> conjunto) {
        // Medir inserción
        long inicio = System.nanoTime();
        for (int i = 0; i < N; i++) {
            conjunto.add(i);
        }
        long fin = System.nanoTime();
        double tiempoInsercion = (fin - inicio) / 1_000_000.0;

        // Medir búsqueda
        inicio = System.nanoTime();
        for (int i = 0; i < N; i++) {
            conjunto.contains(i);
        }
        fin = System.nanoTime();
        double tiempoBusqueda = (fin - inicio) / 1_000_000.0;

        // Medir eliminación
        inicio = System.nanoTime();
        for (int i = 0; i < N; i++) {
            conjunto.remove(i);
        }
        fin = System.nanoTime();
        double tiempoEliminacion = (fin - inicio) / 1_000_000.0;

        System.out.printf("%s - Inserción: %.3f ms | Búsqueda: %.3f ms | Eliminación: %.3f ms%n",
                nombre, tiempoInsercion, tiempoBusqueda, tiempoEliminacion);
    }
}