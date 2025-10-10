# 🧮 Algoritmos de Ordenación Básicos

Este repositorio contiene implementaciones de varios algoritmos clásicos de ordenación en Java. Incluye explicaciones, complejidad temporal y ejemplos de uso para cada algoritmo.

---

## 📚 Contenido

Los algoritmos incluidos son:

| Algoritmo                      | Complejidad Mejor | Complejidad Promedio | Complejidad Peor Caso | Tipo de Método     | Estable |
|------------------------------- | ------------------|----------------------|------------------------|--------------------|----------|
| **Selección (Selection Sort)** | O(n²)             | O(n²)                | O(n²)                 | Comparativo        | ❌ |
| **Inserción (Insertion Sort)** | O(n)              | O(n²)                | O(n²)                 | Comparativo        | ✅ |
| **Burbuja (Bubble Sort)**      | O(n)              | O(n²)                | O(n²)                 | Comparativo        | ✅ |
| **CombSort**                   | O(n)              | O(n²)                | O(n²)                 | Comparativo        | ❌ |
| **HeapSort**                   | O(n log n)        | O(n log n)           | O(n log n)            | Basado en montículo| ❌ |

---

## 🧠 Descripción breve de cada algoritmo

### 🔹 Ordenación por Selección
Selecciona repetidamente el elemento más pequeño del arreglo y lo coloca en su posición correcta.  
Fácil de entender, pero ineficiente para grandes volúmenes de datos.

### 🔹 Ordenación por Inserción
Construye la lista ordenada elemento a elemento, insertando cada nuevo valor en la posición adecuada.  
Muy eficiente para listas pequeñas o casi ordenadas.

### 🔹 Ordenación por Burbuja
Compara elementos adyacentes e intercambia si están desordenados, repitiendo hasta que no haya más cambios.  
Poco eficiente, pero útil para comprender la mecánica básica de comparación e intercambio.

### 🔹 CombSort
Una mejora del Burbuja que compara elementos con una cierta “brecha” que se va reduciendo en cada pasada.  
Más rápido que BubbleSort en la práctica.

### 🔹 HeapSort
Convierte el arreglo en un montículo (heap) y extrae repetidamente el elemento máximo/minimo.  
Eficiente y de complejidad O(n log n), aunque no estable.

---

## ⚙️ Ejemplo de uso

```java
int[] datos = {5, 2, 9, 1, 5, 6};

HeapSort.sort(datos);

System.out.println(Arrays.toString(datos));
// Salida: [1, 2, 5, 5, 6, 9]
