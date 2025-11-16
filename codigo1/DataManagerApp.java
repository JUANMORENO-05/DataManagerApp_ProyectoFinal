// ==================== CLASE PRINCIPAL ====================
import java.util.Scanner;

public class DataManagerApp {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║  DATAMANAGER APP - Sistema Educativo para Estructuras  ║");
        System.out.println("║          de Datos y Visualización Interactiva          ║");
        System.out.println("╚════════════════════════════════════════════════════════╝\n");
        
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1: menuEstructurasEstaticas(); break;
                case 2: menuListas(); break;
                case 3: menuPilas(); break;
                case 4: menuColas(); break;
                case 5: menuArboles(); break;
                case 0:
                    System.out.println("\n¡Gracias por usar DataManagerApp!");
                    System.out.println("Sistema diseñado para el aprendizaje de estructuras de datos.");
                    break;
                default:
                    System.out.println(" Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void mostrarMenuPrincipal() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║      DATAMANAGER APP - MENÚ PRINCIPAL   ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("1. Estructuras Estáticas (Arreglos)");
        System.out.println("2. Listas Enlazadas (Simples y Dobles)");
        System.out.println("3. Pilas (Stack - LIFO)");
        System.out.println("4. Colas (Queue - FIFO)");
        System.out.println("5. Árboles Binarios de Búsqueda");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    // ====================== MENÚ ARREGLOS ======================
    private static void menuEstructurasEstaticas() {
        ArregloEstatico arreglo = new ArregloEstatico(15);
        int opcion;
        
        do {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║    ESTRUCTURAS ESTÁTICAS (ARREGLOS)   ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Modificar elemento por índice");
            System.out.println("4. Búsqueda lineal");
            System.out.println("5. Búsqueda binaria (requiere ordenamiento)");
            System.out.println("6. Ordenar arreglo (Burbuja)");
            System.out.println("7. Ordenar arreglo (Inserción)");
            System.out.println("8. Mostrar arreglo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    arreglo.insertar(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Índice: ");
                    arreglo.eliminar(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Índice: ");
                    int idx = scanner.nextInt();
                    System.out.print("Nuevo valor: ");
                    arreglo.modificar(idx, scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Valor a buscar: ");
                    arreglo.busquedaLineal(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Valor a buscar: ");
                    arreglo.busquedaBinaria(scanner.nextInt());
                    break;
                case 6:
                    arreglo.ordenarBurbuja();
                    break;
                case 7:
                    arreglo.ordenarInsercion();
                    break;
                case 8:
                    arreglo.mostrar();
                    break;
            }
        } while (opcion != 0);
    }
    
    // ====================== MENÚ LISTAS ======================
    private static void menuListas() {
        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║      TIPO DE LISTA ENLAZADA       ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println("1. Lista Simple");
        System.out.println("2. Lista Doble");
        System.out.print("Seleccione: ");
        int tipo = scanner.nextInt();
        
        if (tipo == 1) menuListaSimple();
        else if (tipo == 2) menuListaDoble();
    }
    
    private static void menuListaSimple() {
        ListaSimple lista = new ListaSimple();
        int opcion;
        
        do {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║      LISTA ENLAZADA SIMPLE        ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Ordenar lista");
            System.out.println("6. Mostrar lista");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    lista.insertarInicio(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Valor: ");
                    lista.insertarFinal(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Valor: ");
                    lista.eliminar(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Valor: ");
                    lista.buscar(scanner.nextInt());
                    break;
                case 5:
                    lista.ordenar();
                    break;
                case 6:
                    lista.mostrar();
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void menuListaDoble() {
        ListaDoble lista = new ListaDoble();
        int opcion;
        
        do {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║       LISTA ENLAZADA DOBLE        ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Mostrar (adelante)");
            System.out.println("5. Mostrar (reversa)");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    lista.insertarInicio(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Valor: ");
                    lista.insertarFinal(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Valor: ");
                    lista.eliminar(scanner.nextInt());
                    break;
                case 4:
                    lista.mostrarAdelante();
                    break;
                case 5:
                    lista.mostrarReversa();
                    break;
            }
        } while (opcion != 0);
    }
    
    // ====================== MENÚ PILAS ======================
    private static void menuPilas() {
        Pila pila = new Pila();
        int opcion;
        
        do {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║        PILAS (STACK - LIFO)       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("1. Push (apilar)");
            System.out.println("2. Pop (desapilar)");
            System.out.println("3. Peek (ver tope)");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Verificar si está vacía");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    pila.push(scanner.nextInt());
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.peek();
                    break;
                case 4:
                    pila.mostrar();
                    break;
                case 5:
                    System.out.println(pila.estaVacia() ? "✓ La pila está vacía" : "✓ La pila tiene elementos");
                    break;
            }
        } while (opcion != 0);
    }
    
    // ====================== MENÚ COLAS ======================
    private static void menuColas() {
        Cola cola = new Cola();
        int opcion;
        
        do {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║        COLAS (QUEUE - FIFO)       ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("1. Enqueue (encolar)");
            System.out.println("2. Dequeue (desencolar)");
            System.out.println("3. Peek (ver frente)");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Verificar si está vacía");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    cola.enqueue(scanner.nextInt());
                    break;
                case 2:
                    cola.dequeue();
                    break;
                case 3:
                    cola.peek();
                    break;
                case 4:
                    cola.mostrar();
                    break;
                case 5:
                    System.out.println(cola.estaVacia() ? "✓ La cola está vacía" : "✓ La cola tiene elementos");
                    break;
            }
        } while (opcion != 0);
    }
    
    // ====================== MENÚ ÁRBOLES ======================
    private static void menuArboles() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        int opcion;
        
        do {
            System.out.println("\n╔══════════════════════════════════════════╗");
            System.out.println("║    ÁRBOLES BINARIOS DE BÚSQUEDA (ABB)    ║");
            System.out.println("╚══════════════════════════════════════════╝");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Buscar nodo");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Recorrido InOrden");
            System.out.println("5. Recorrido PreOrden");
            System.out.println("6. Recorrido PostOrden");
            System.out.println("7. Altura del árbol");
            System.out.println("8. Contar nodos");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    arbol.insertar(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Valor: ");
                    arbol.buscar(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Valor: ");
                    arbol.eliminar(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("InOrden: ");
                    arbol.inOrden();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("PreOrden: ");
                    arbol.preOrden();
                    System.out.println();
                    break;
                case 6:
                    System.out.print("PostOrden: ");
                    arbol.postOrden();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Altura: " + arbol.altura());
                    break;
                case 8:
                    System.out.println("Nodos: " + arbol.contarNodos());
                    break;
            }
        } while (opcion != 0);
    }
}

// ==================== ARREGLO ESTÁTICO ====================
class ArregloEstatico {
    private int[] arreglo;
    private int tamanio;
    private int capacidad;
    
    public ArregloEstatico(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.tamanio = 0;
    }
    
    public void insertar(int valor) {
        if (tamanio >= capacidad) {
            System.out.println(" Arreglo lleno");
            return;
        }
        arreglo[tamanio++] = valor;
        System.out.println("✓ Elemento " + valor + " insertado");
    }
    
    public void eliminar(int indice) {
        if (indice < 0 || indice >= tamanio) {
            System.out.println(" Índice inválido");
            return;
        }
        
        for (int i = indice; i < tamanio - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        tamanio--;
        System.out.println("✓ Elemento eliminado");
    }
    
    public void modificar(int indice, int valor) {
        if (indice < 0 || indice >= tamanio) {
            System.out.println(" Índice inválido");
            return;
        }
        arreglo[indice] = valor;
        System.out.println("✓ Elemento modificado");
    }
    
    public void busquedaLineal(int valor) {
        for (int i = 0; i < tamanio; i++) {
            if (arreglo[i] == valor) {
                System.out.println("✓ Encontrado en índice: " + i);
                return;
            }
        }
        System.out.println(" No encontrado");
    }
    
    public void busquedaBinaria(int valor) {
        int izq = 0, der = tamanio - 1;
        
        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            
            if (arreglo[medio] == valor) {
                System.out.println("✓ Encontrado en índice: " + medio);
                return;
            }
            
            if (arreglo[medio] < valor) izq = medio + 1;
            else der = medio - 1;
        }
        System.out.println(" No encontrado");
    }
    
    public void ordenarBurbuja() {
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        System.out.println("✓ Arreglo ordenado (Burbuja)");
    }
    
    public void ordenarInsercion() {
        for (int i = 1; i < tamanio; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
        System.out.println("✓ Arreglo ordenado (Inserción)");
    }
    
    public void mostrar() {
        if (tamanio == 0) {
            System.out.println(" Arreglo vacío");
            return;
        }
        
        System.out.print("Arreglo: [");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(arreglo[i]);
            if (i < tamanio - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

// ==================== NODO SIMPLE ====================
class Nodo {
    int dato;
    Nodo siguiente;
    
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

// ==================== LISTA SIMPLE ====================
class ListaSimple {
    private Nodo cabeza;
    
    public ListaSimple() {
        this.cabeza = null;
    }
    
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        System.out.println("✓ Elemento " + dato + " insertado al inicio");
    }
    
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        
        if (cabeza == null) cabeza = nuevo;
        else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " insertado al final");
    }
    
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println(" Lista vacía");
            return;
        }
        
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            System.out.println("✓ Elemento " + dato + " eliminado");
            return;
        }
        
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }
        
        if (actual.siguiente == null) System.out.println(" No encontrado");
        else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("✓ Elemento " + dato + " eliminado");
        }
    }
    
    public void buscar(int dato) {
        Nodo actual = cabeza;
        int pos = 0;
        
        while (actual != null) {
            if (actual.dato == dato) {
                System.out.println("✓ Encontrado en posición: " + pos);
                return;
            }
            actual = actual.siguiente;
            pos++;
        }
        System.out.println(" No encontrado");
    }
    
    public void ordenar() {
        if (cabeza == null || cabeza.siguiente == null) {
            System.out.println(" Lista vacía o con un elemento");
            return;
        }
        
        boolean cambio;
        do {
            cambio = false;
            Nodo actual = cabeza;
            
            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {
                    int temp = actual.dato;
                    actual.dato = actual.siguiente.dato;
                    actual.siguiente.dato = temp;
                    cambio = true;
                }
                actual = actual.siguiente;
            }
        } while (cambio);
        
        System.out.println("✓ Lista ordenada");
    }
    
    public void mostrar() {
        if (cabeza == null) {
            System.out.println(" Lista vacía");
            return;
        }
        
        System.out.print("Lista: ");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" -> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

// ==================== NODO DOBLE ====================
class NodoDoble {
    int dato;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

// ==================== LISTA DOBLE ====================
class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;
    
    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }
    
    public void insertarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        
        if (cabeza == null) cabeza = cola = nuevo;
        else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " insertado al inicio");
    }
    
    public void insertarFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        
        if (cola == null) cabeza = cola = nuevo;
        else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " insertado al final");
    }
    
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println(" Lista vacía");
            return;
        }
        
        NodoDoble actual = cabeza;
        
        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }
        
        if (actual == null) {
            System.out.println(" No encontrado");
            return;
        }
        
        if (actual == cabeza && actual == cola) cabeza = cola = null;
        else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        } 
        else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
        } 
        else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }
        
        System.out.println("✓ Elemento " + dato + " eliminado");
    }
    
    public void mostrarAdelante() {
        if (cabeza == null) {
            System.out.println(" Lista vacía");
            return;
        }
        
        System.out.print("Lista: ");
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" <-> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    
    public void mostrarReversa() {
        if (cola == null) {
            System.out.println(" Lista vacía");
            return;
        }
        
        System.out.print("Lista (reversa): ");
        NodoDoble actual = cola;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.anterior != null) System.out.print(" <-> ");
            actual = actual.anterior;
        }
        System.out.println();
    }
}

// ==================== PILA ====================
class Pila {
    private Nodo tope;
    
    public Pila() {
        this.tope = null;
    }
    
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        System.out.println("✓ Elemento " + dato + " apilado");
    }
    
    public void pop() {
        if (tope == null) {
            System.out.println(" Pila vacía");
            return;
        }
        
        int dato = tope.dato;
        tope = tope.siguiente;
        System.out.println("✓ Elemento " + dato + " desapilado");
    }
    
    public void peek() {
        if (tope == null) {
            System.out.println(" Pila vacía");
            return;
        }
        System.out.println("Tope: " + tope.dato);
    }
    
    public boolean estaVacia() {
        return tope == null;
    }
    
    public void mostrar() {
        if (tope == null) {
            System.out.println(" Pila vacía");
            return;
        }
        
        System.out.print("Pila: ");
        Nodo actual = tope;
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) System.out.print(" -> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

// ==================== COLA ====================
class Cola {
    private Nodo frente;
    private Nodo finalCola;
    
    public Cola() {
        this.frente = null;
        this.finalCola = null;
    }
    
    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        
        if (finalCola == null) frente = finalCola = nuevo;
        else {
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " encolado");
    }
    
    public void dequeue() {
        if (frente == null) {
            System.out.println(" Cola vacía");
            return;
        }
        
        int dato = frente.dato;
        frente = frente.siguiente;
        
        if (frente == null) finalCola = null;
        
        System.out.println("✓ Elemento " + dato + " desencolado");
    }
    
    public void peek() {
        if (frente == null) {
            System.out.println(" Cola vacía");
            return;
        }
        System.out.println("Frente: " + frente.dato);
    }
    
    public boolean estaVacia() {
        return frente == null;
    }
    
    public void mostrar() {
        if (frente == null) {
            System.out.println(" Cola vacía");
            return;
        }
        
        System.out.print("Cola: ");
        Nodo actual = frente;
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) System.out.print(" <- ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

// ==================== NODO ÁRBOL ====================
class NodoArbol {
    int dato;
    NodoArbol izquierdo;
    NodoArbol derecho;
    
    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}

// ==================== ÁRBOL BINARIO DE BÚSQUEDA ====================
class ArbolBinarioBusqueda {
    private NodoArbol raiz;
    
    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }
    
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
        System.out.println("✓ Elemento " + dato + " insertado");
    }
    
    private NodoArbol insertarRecursivo(NodoArbol nodo, int dato) {
        if (nodo == null) return new NodoArbol(dato);
        
        if (dato < nodo.dato) nodo.izquierdo = insertarRecursivo(nodo.izquierdo, dato);
        else if (dato > nodo.dato) nodo.derecho = insertarRecursivo(nodo.derecho, dato);
        
        return nodo;
    }
    
    public void buscar(int dato) {
        if (buscarRecursivo(raiz, dato)) {
            System.out.println("✓ Elemento " + dato + " encontrado");
        } else {
            System.out.println(" Elemento " + dato + " no encontrado");
        }
    }
    
    private boolean buscarRecursivo(NodoArbol nodo, int dato) {
        if (nodo == null) return false;
        if (dato == nodo.dato) return true;
        
        return dato < nodo.dato 
            ? buscarRecursivo(nodo.izquierdo, dato)
            : buscarRecursivo(nodo.derecho, dato);
    }
    
    public void eliminar(int dato) {
        raiz = eliminarRecursivo(raiz, dato);
        System.out.println("✓ Elemento eliminado (si existía)");
    }
    
    private NodoArbol eliminarRecursivo(NodoArbol nodo, int dato) {
        if (nodo == null) return null;
        
        if (dato < nodo.dato) nodo.izquierdo = eliminarRecursivo(nodo.izquierdo, dato);
        else if (dato > nodo.dato) nodo.derecho = eliminarRecursivo(nodo.derecho, dato);
        else {
            if (nodo.izquierdo == null) return nodo.derecho;
            if (nodo.derecho == null) return nodo.izquierdo;
            
            NodoArbol sucesor = minimo(nodo.derecho);
            nodo.dato = sucesor.dato;
            nodo.derecho = eliminarRecursivo(nodo.derecho, sucesor.dato);
        }
        return nodo;
    }
    
    private NodoArbol minimo(NodoArbol nodo) {
        while (nodo.izquierdo != null) nodo = nodo.izquierdo;
        return nodo;
    }
    
    public void inOrden() {
        inOrdenRec(raiz);
    }
    
    private void inOrdenRec(NodoArbol nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inOrdenRec(nodo.derecho);
        }
    }
    
    public void preOrden() {
        preOrdenRec(raiz);
    }
    
    private void preOrdenRec(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrdenRec(nodo.izquierdo);
            preOrdenRec(nodo.derecho);
        }
    }
    
    public void postOrden() {
        postOrdenRec(raiz);
    }
    
    private void postOrdenRec(NodoArbol nodo) {
        if (nodo != null) {
            postOrdenRec(nodo.izquierdo);
            postOrdenRec(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }
    
    public int altura() {
        return alturaRec(raiz);
    }
    
    private int alturaRec(NodoArbol nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(alturaRec(nodo.izquierdo), alturaRec(nodo.derecho));
    }
    
    public int contarNodos() {
        return contarRec(raiz);
    }
    
    private int contarRec(NodoArbol nodo) {
        if (nodo == null) return 0;
        return 1 + contarRec(nodo.izquierdo) + contarRec(nodo.derecho);
    }
}
