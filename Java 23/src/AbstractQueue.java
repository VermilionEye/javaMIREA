public abstract class AbstractQueue<E> implements Queue<E> {
    protected Node<E> front;  // указатель на начало очереди
    protected Node<E> rear;   // указатель на конец очереди
    protected int size;       // текущий размер очереди

    // Конструктор базового класса
    public AbstractQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Внутренний класс для узла
    protected static class Node<E> {
        E data;
        Node<E> next;

        // Конструктор узла
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
