public interface Queue<E> {
    void enqueue(E item);     // Добавляет элемент в конец очереди.
    E dequeue();              // Удаляет и возвращает элемент из начала очереди.
    boolean isEmpty();        // Проверяет, пуста ли очередь.
    int size();               // Возвращает текущий размер очереди.
}
