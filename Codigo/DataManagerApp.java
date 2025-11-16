// ==================== CLASE PRINCIPAL ====================
import java.util.Scanner;

public class DataManagerApp {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    menuEstructurasEstaticas();
                    break;
                case 2:
                    menuListas();
                    break;
                case 3:
                    menuPilas();
                    break;
                case 4:
                    menuColas();
                    break;
                case 5:
                    menuArboles();
                    break;
                case 6:
                    menuRecursividad();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar DataManagerApp!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void mostrarMenuPrincipal() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║      DATAMANAGER APP - MENÚ PRINCIPAL   ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("1. Estructuras Estáticas (Arreglos)");
        System.out.println("2. Listas Enlazadas");
        System.out.println("3. Pilas (Stack)");
        System.out.println("4. Colas (Queue)");
        System.out.println("5. Árboles Binarios");
        System.out.println("6. Ejemplos de Recursividad");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    // ==================== MENÚ ESTRUCTURAS ESTÁTICAS ====================
    private static void menuEstructurasEstaticas() {
        ArregloEstatico arreglo = new ArregloEstatico(10);
        int opcion;
        
        do {
            System.out.println("\n--- ESTRUCTURAS ESTÁTICAS ---");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Buscar elemento (lineal)");
            System.out.println("4. Ordenar arreglo (burbuja)");
            System.out.println("5. Búsqueda binaria (requiere ordenamiento)");
            System.out.println("6. Mostrar arreglo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor: ");
                    int valor = scanner.nextInt();
                    arreglo.insertar(valor);
                    break;
                case 2:
                    System.out.print("Ingrese índice: ");
                    int indice = scanner.nextInt();
                    arreglo.eliminar(indice);
                    break;
                case 3:
                    System.out.print("Ingrese valor a buscar: ");
                    int buscar = scanner.nextInt();
                    arreglo.busquedaLineal(buscar);
                    break;
                case 4:
                    arreglo.ordenarBurbuja();
                    break;
                case 5:
                    System.out.print("Ingrese valor a buscar: ");
                    int buscarBin = scanner.nextInt();
                    arreglo.busquedaBinaria(buscarBin);
                    break;
                case 6:
                    arreglo.mostrar();
                    break;
            }
        } while (opcion != 0);
    }
    
    // ==================== MENÚ LISTAS ====================
    private static void menuListas() {
        System.out.println("\n--- TIPO DE LISTA ---");
        System.out.println("1. Lista Simple");
        System.out.println("2. Lista Doble");
        System.out.print("Seleccione: ");
        int tipo = scanner.nextInt();
        
        if (tipo == 1) {
            menuListaSimple();
        } else if (tipo == 2) {
            menuListaDoble();
        }
    }
    
    private static void menuListaSimple() {
        ListaSimple lista = new ListaSimple();
        int opcion;
        
        do {
            System.out.println("\n--- LISTA SIMPLE ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Ordenar lista (burbuja)");
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
                    System.out.print("Valor a eliminar: ");
                    lista.eliminar(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Valor a buscar: ");
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
            System.out.println("\n--- LISTA DOBLE ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Mostrar lista (adelante)");
            System.out.println("5. Mostrar lista (reversa)");
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
                    System.out.print("Valor a eliminar: ");
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
    
    // ==================== MENÚ PILAS ====================
    private static void menuPilas() {
        Pila pila = new Pila();
        int opcion;
        
        do {
            System.out.println("\n--- PILAS (STACK - LIFO) ---");
            System.out.println("1. Push (apilar)");
            System.out.println("2. Pop (desapilar)");
            System.out.println("3. Peek (ver tope)");
            System.out.println("4. Mostrar pila");
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
            }
        } while (opcion != 0);
    }
    
    // ==================== MENÚ COLAS ====================
    private static void menuColas() {
        Cola cola = new Cola();
        int opcion;
        
        do {
            System.out.println("\n--- COLAS (QUEUE - FIFO) ---");
            System.out.println("1. Enqueue (encolar)");
            System.out.println("2. Dequeue (desencolar)");
            System.out.println("3. Peek (ver frente)");
            System.out.println("4. Mostrar cola");
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
            }
        } while (opcion != 0);
    }
    
    // ==================== MENÚ ÁRBOLES ====================
    private static void menuArboles() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        int opcion;
        
        do {
            System.out.println("\n--- ÁRBOLES BINARIOS DE BÚSQUEDA ---");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Buscar nodo");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Recorrido InOrden (izq-raíz-der)");
            System.out.println("5. Recorrido PreOrden (raíz-izq-der)");
            System.out.println("6. Recorrido PostOrden (izq-der-raíz)");
            System.out.println("7. Altura del árbol");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    arbol.insertar(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Valor a buscar: ");
                    arbol.buscar(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Valor a eliminar: ");
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
            }
        } while (opcion != 0);
    }
    
    // ==================== MENÚ RECURSIVIDAD ====================
    private static void menuRecursividad() {
        int opcion;
        
        do {
            System.out.println("\n--- EJEMPLOS DE RECURSIVIDAD ---");
            System.out.println("1. Factorial");
            System.out.println("2. Fibonacci");
            System.out.println("3. Suma de arreglo");
            System.out.println("4. Torres de Hanoi");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Número: ");
                    int n = scanner.nextInt();
                    System.out.println("Factorial: " + Recursividad.factorial(n));
                    break;
                case 2:
                    System.out.print("Posición: ");
                    int pos = scanner.nextInt();
                    System.out.println("Fibonacci: " + Recursividad.fibonacci(pos));
                    break;
                case 3:
                    int[] arr = {1, 2, 3, 4, 5};
                    System.out.println("Suma del arreglo [1,2,3,4,5]: " + 
                                    Recursividad.sumaArreglo(arr, arr.length));
                    break;
                case 4:
                    System.out.print("Número de discos: ");
                    int discos = scanner.nextInt();
                    Recursividad.torresHanoi(discos, 'A', 'C', 'B');
                    break;
            }
        } while (opcion != 0);
    }
}

// ==================== ESTRUCTURAS ESTÁTICAS ====================
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
            System.out.println("❌ Arreglo lleno");
            return;
        }
        arreglo[tamanio++] = valor;
        System.out.println("✓ Elemento " + valor + " insertado");
    }
    
    public void eliminar(int indice) {
        if (indice < 0 || indice >= tamanio) {
            System.out.println("❌ Índice inválido");
            return;
        }
        
        for (int i = indice; i < tamanio - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        tamanio--;
        System.out.println("✓ Elemento eliminado");
    }
    
    public void busquedaLineal(int valor) {
        for (int i = 0; i < tamanio; i++) {
            if (arreglo[i] == valor) {
                System.out.println("✓ Elemento encontrado en índice: " + i);
                return;
            }
        }
        System.out.println("❌ Elemento no encontrado");
    }
    
    public void busquedaBinaria(int valor) {
        int izq = 0, der = tamanio - 1;
        
        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            
            if (arreglo[medio] == valor) {
                System.out.println("✓ Elemento encontrado en índice: " + medio);
                return;
            }
            
            if (arreglo[medio] < valor) {
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }
        System.out.println("❌ Elemento no encontrado");
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
        System.out.println("✓ Arreglo ordenado");
    }
    
    public void mostrar() {
        if (tamanio == 0) {
            System.out.println("Arreglo vacío");
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

// ==================== NODO PARA LISTA SIMPLE ====================
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
        
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " insertado al final");
    }
    
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println("❌ Lista vacía");
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
        
        if (actual.siguiente == null) {
            System.out.println("❌ Elemento no encontrado");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("✓ Elemento " + dato + " eliminado");
        }
    }
    
    public void buscar(int dato) {
        Nodo actual = cabeza;
        int posicion = 0;
        
        while (actual != null) {
            if (actual.dato == dato) {
                System.out.println("✓ Elemento encontrado en posición: " + posicion);
                return;
            }
            actual = actual.siguiente;
            posicion++;
        }
        System.out.println("❌ Elemento no encontrado");
    }
    
    public void ordenar() {
        if (cabeza == null || cabeza.siguiente == null) {
            System.out.println("Lista vacía o con un solo elemento");
            return;
        }
        
        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = cabeza;
            
            while (actual.siguiente != null) {
                if (actual.dato > actual.siguiente.dato) {
                    int temp = actual.dato;
                    actual.dato = actual.siguiente.dato;
                    actual.siguiente.dato = temp;
                    intercambio = true;
                }
                actual = actual.siguiente;
            }
        } while (intercambio);
        
        System.out.println("✓ Lista ordenada");
    }
    
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
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
        
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " insertado al inicio");
    }
    
    public void insertarFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " insertado al final");
    }
    
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println("❌ Lista vacía");
            return;
        }
        
        NodoDoble actual = cabeza;
        
        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }
        
        if (actual == null) {
            System.out.println("❌ Elemento no encontrado");
            return;
        }
        
        if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) cabeza.anterior = null;
            else cola = null;
        } else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }
        
        System.out.println("✓ Elemento " + dato + " eliminado");
    }
    
    public void mostrarAdelante() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        
        System.out.print("Lista (adelante): ");
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
            System.out.println("Lista vacía");
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
            System.out.println("❌ Pila vacía (Underflow)");
            return;
        }
        
        int dato = tope.dato;
        tope = tope.siguiente;
        System.out.println("✓ Elemento " + dato + " desapilado");
    }
    
    public void peek() {
        if (tope == null) {
            System.out.println("❌ Pila vacía");
            return;
        }
        System.out.println("Tope: " + tope.dato);
    }
    
    public void mostrar() {
        if (tope == null) {
            System.out.println("Pila vacía");
            return;
        }
        
        System.out.print("Pila (tope->abajo): ");
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
    private Nodo final_;
    
    public Cola() {
        this.frente = null;
        this.final_ = null;
    }
    
    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        
        if (final_ == null) {
            frente = final_ = nuevo;
        } else {
            final_.siguiente = nuevo;
            final_ = nuevo;
        }
        System.out.println("✓ Elemento " + dato + " encolado");
    }
    
    public void dequeue() {
        if (frente == null) {
            System.out.println("❌ Cola vacía (Underflow)");
            return;
        }
        
        int dato = frente.dato;
        frente = frente.siguiente;
        
        if (frente == null) {
            final_ = null;
        }
        
        System.out.println("✓ Elemento " + dato + " desencolado");
    }
    
    public void peek() {
        if (frente == null) {
            System.out.println("❌ Cola vacía");
            return;
        }
        System.out.println("Frente: " + frente.dato);
    }
    
    public void mostrar() {
        if (frente == null) {
            System.out.println("Cola vacía");
            return;
        }
        
        System.out.print("Cola (frente->final): ");
        Nodo actual = frente;
        while (actual != null) {
            System.out.print("[" + actual.dato + "]");
            if (actual.siguiente != null) System.out.print(" <- ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

// ==================== NODO DE ÁRBOL ====================
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
        if (nodo == null) {
            return new NodoArbol(dato);
        }
        
        if (dato < nodo.dato) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, dato);
        } else if (dato > nodo.dato) {
            nodo.derecho = insertarRecursivo(nodo.derecho, dato);
        }
        
        return nodo;
    }
    
    public void buscar(int dato) {
        if (buscarRecursivo(raiz, dato)) {
            System.out.println("✓ Elemento " + dato + " encontrado");
        } else {
            System.out.println("❌ Elemento " + dato + " no encontrado");
        }
    }
    
    private boolean buscarRecursivo(NodoArbol nodo, int dato) {
        if (nodo == null) {
            return false;
        }
        
        if (dato == nodo.dato) {
            return true;
        }
        
        return dato < nodo.dato 
            ? buscarRecursivo(nodo.izquierdo, dato)
            : buscarRecursivo(nodo.derecho, dato);
    }
    
    public void eliminar(int dato) {
        raiz = eliminarRecursivo(raiz, dato);
        System.out.println("✓ Elemento eliminado (si existía)");
    }
    
    private NodoArbol eliminarRecursivo(NodoArbol nodo, int dato) {
        if (nodo == null) {
            return null;
        }
        
        if (dato < nodo.dato) {
            nodo.izquierdo = eliminarRecursivo(nodo.izquierdo, dato);
        } else if (dato > nodo.dato) {
            nodo.derecho = eliminarRecursivo(nodo.derecho, dato);
        } else {
            // Nodo encontrado
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }
            
            // Nodo con dos hijos: obtener sucesor inorden
            nodo.dato = valorMinimo(nodo.derecho);
            nodo.derecho = eliminarRecursivo(nodo.derecho, nodo.dato);
        }
        
        return nodo;
    }
    
    private int valorMinimo(NodoArbol nodo) {
        int minimo = nodo.dato;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.dato;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }
    
    public void inOrden() {
        inOrdenRecursivo(raiz);
    }
    
    private void inOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inOrdenRecursivo(nodo.derecho);
        }
    }
    
    public void preOrden() {
        preOrdenRecursivo(raiz);
    }
    
    private void preOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preOrdenRecursivo(nodo.izquierdo);
            preOrdenRecursivo(nodo.derecho);
        }
    }
    
    public void postOrden() {
        postOrdenRecursivo(raiz);
    }
    
    private void postOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.izquierdo);
            postOrdenRecursivo(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }
    
    public int altura() {
        return alturaRecursiva(raiz);
    }
    
    private int alturaRecursiva(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        
        int alturaIzq = alturaRecursiva(nodo.izquierdo);
        int alturaDer = alturaRecursiva(nodo.derecho);
        
        return Math.max(alturaIzq, alturaDer) + 1;
    }
}

// ==================== RECURSIVIDAD ====================
class Recursividad {
    
    // Factorial usando recursividad
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("❌ El factorial no está definido para números negativos");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // Fibonacci usando recursividad
    public static int fibonacci(int n) {
        if (n < 0) {
            System.out.println("❌ Posición inválida");
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Suma de elementos de un arreglo
    public static int sumaArreglo(int[] arreglo, int n) {
        if (n <= 0) {
            return 0;
        }
        return arreglo[n - 1] + sumaArreglo(arreglo, n - 1);
    }
    
    // Torres de Hanoi
    public static void torresHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        
        torresHanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        torresHanoi(n - 1, auxiliar, destino, origen);
    }
}