import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperacionesSet {
    public static void main(String[] args) {
        Set<String> grupoA = new HashSet<>(Arrays.asList("Java", "Python", "SQL"));
        Set<String> grupoB = new HashSet<>(Arrays.asList("Python", "Git", "Docker"));

        // Unión
        Set<String> union = new HashSet<>(grupoA);
        union.addAll(grupoB);
        System.out.println("Unión: " + union);

        // Intersección
        Set<String> interseccion = new HashSet<>(grupoA);
        interseccion.retainAll(grupoB);
        System.out.println("Intersección: " + interseccion);

        // Diferencia (A - B)
        Set<String> diferencia = new HashSet<>(grupoA);
        diferencia.removeAll(grupoB);
        System.out.println("Diferencia (Grupo A - Grupo B): " + diferencia);
    }
}