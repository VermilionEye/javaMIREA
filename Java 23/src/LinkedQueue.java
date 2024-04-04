public class LinkedQueue<E> extends AbstractQueue<E> {
    @Override
    public void enqueue(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            // Обработка ошибки или возврат null, в зависимости от требований
            return null;
        }
        E data = front.data;
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null;
        }

        return data;
    }
}
