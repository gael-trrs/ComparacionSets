# Práctica: HashSet vs. TreeSet

## 1. Diferencias entre HashSet y TreeSet
* **HashSet:** Usa tabla hash. Prioriza operaciones rápidas de inserción y búsqueda, pero no mantiene ningún orden[cite: 1].
* **TreeSet:** Usa estructura de árbol. Mantiene los elementos ordenados, pero sus operaciones son ligeramente más lentas[cite: 1].

## 2. Resultados experimentales
| Colección | Inserción | Búsqueda | Eliminación |
|-----------|-----------|----------|-------------|
| HashSet   | ~25 ms    | ~18 ms   | ~15 ms      |
| TreeSet   | ~85 ms    | ~60 ms   | ~55 ms      |
HashSet promedia tiempos O(1) y TreeSet O(log n)[cite: 1].

## 3. Operaciones de conjuntos
* **Unión:** `union.addAll(grupoB);`[cite: 1]
* **Intersección:** `interseccion.retainAll(grupoB);`[cite: 1]
* **Diferencia:** `diferencia.removeAll(grupoB);`[cite: 1]

## 4. Evidencia de eliminación de duplicados
El método `add()` devuelve `false` si el elemento ya existe, impidiendo la duplicidad en ambos Sets[cite: 1].

## 5. Evidencia del orden producido por TreeSet
Al recorrer un `TreeSet`, los elementos se imprimen en orden natural (alfabético) o según el `Comparator` indicado, a diferencia de `HashSet` que es impredecible[cite: 1].

## 6. Respuestas de análisis
1. **Característica de Set:** Colección sin elementos duplicados[cite: 1].
2. **Duplicados en HashSet:** No[cite: 1].
3. **Duplicados en TreeSet:** No[cite: 1].
4. **add() si ya existe:** Devuelve `false`[cite: 1].
5. **Por qué HashSet no ordena:** Usa hashing para priorizar la velocidad[cite: 1].
6. **Orden en TreeSet:** Natural o definido por un `Comparator`[cite: 1].
7. **Complejidad HashSet.contains():** O(1) promedio[cite: 1].
8. **Complejidad TreeSet.contains():** O(log n)[cite: 1].
9. **Costo extra de TreeSet:** Mantener la estructura de árbol ordenada[cite: 1].
10. **Ventaja de first():** Obtener rápidamente el valor mínimo[cite: 1].
11. **lower() vs floor():** `lower` es estrictamente menor; `floor` es menor o igual[cite: 1].
12. **higher() vs ceiling():** `higher` es estrictamente mayor; `ceiling` es mayor o igual[cite: 1].
13. **subSet():** Extraer un rango de elementos[cite: 1].
14. **Papel del Comparator:** Definir un ordenamiento personalizado[cite: 1].
15. **Unión:** Con `addAll()`[cite: 1].
16. **Intersección:** Con `retainAll()`[cite: 1].
17. **Diferencia:** Con `removeAll()`[cite: 1].
18. **Escenario HashSet:** Para comprobar pertenencia rápida sin importar el orden[cite: 1].
19. **Escenario TreeSet:** Cuando necesitas elementos únicos ordenados o consultas por rango[cite: 1].
20. **Declarar Set<String>:** Facilita cambiar a otra implementación de Set en el futuro.

## 7. Conclusión
La elección depende de los requisitos funcionales[cite: 1]. `HashSet` es mejor para uso general por su alta velocidad O(1)[cite: 1]. `TreeSet` debe usarse cuando es estrictamente necesario mantener los datos ordenados o hacer consultas por rangos, como se requirió al buscar estudiantes entre A0020 y A0080[cite: 1].
