import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Creamos un escáner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos una cola
        Cola<Integer> cola = new Cola<>();

        // Creamos un menú
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir elemento (Enqueue - Push)");
            System.out.println("2. Eliminar elemento (Dequeue - Pop)");
            System.out.println("3. Tamaño de la lista (Size)");
            System.out.println("4. Estado de la lista (Empty)");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Mostrar elemento: ");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el elemento a añadir:");
                    int elemento = scanner.nextInt();
                    cola.enqueue(elemento);
                    break;
                case 2:
                    System.out.println("El elemento eliminado es: " + cola.dequeue());
                    break;
                case 3:
                    System.out.println("El tamaño de la cola es: " + cola.size());
                    break;
                case 4:
                    System.out.println("¿La cola está vacía?: " + cola.isEmpty());
                    break;
                case 5:
                    cola.mostrarLista();
                    break;
                case 6:
                    System.out.println("El elemento superior es: " + cola.top());
                    break;
            }
        } while (opcion != 7);
    }
}
