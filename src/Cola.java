import java.util.LinkedList;

public class Cola<T> {

    private LinkedList<T> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    public void enqueue(T elemento) {
        cola.addLast(elemento);
    }

    public T dequeue() {
        return cola.removeFirst();
    }
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public int size() {
        return cola.size();
    }
    public void mostrarLista() {
        for (T elemento : cola) {
            System.out.println(elemento);
        }
    }
    public T top() {
        return cola.peekFirst();
    }
}
