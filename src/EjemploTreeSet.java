import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> tecnologias = new TreeSet<>();

        tecnologias.add("Java");
        tecnologias.add("Python");
        tecnologias.add("JavaScript");
        tecnologias.add("Java"); // Duplicado
        tecnologias.add("SQL");
        tecnologias.add("Git");
        tecnologias.add("Docker");

        System.out.println("Elementos ordenados en TreeSet:");
        for (String tecnologia : tecnologias) {
            System.out.println(tecnologia);
        }
    }
}