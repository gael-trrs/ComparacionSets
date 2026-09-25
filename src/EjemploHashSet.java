import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        Set<String> tecnologias = new HashSet<>();

        tecnologias.add("Java");
        tecnologias.add("Python");
        tecnologias.add("JavaScript");
        // Intento de duplicado
        boolean agregado = tecnologias.add("Java");
        tecnologias.add("SQL");
        tecnologias.add("Python"); // Otro duplicado
        tecnologias.add("Git");
        tecnologias.add("Docker");

        System.out.println("Elementos en HashSet: " + tecnologias);
        System.out.println("¿Se agregó el duplicado 'Java'?: " + agregado);
    }
}